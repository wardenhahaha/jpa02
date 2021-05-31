package com.jpa02.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
	entityManagerFactoryRef = "entityManagerFactoryDataBase", // 配置连接工厂
	basePackages = {"com.jpa02.repository"} // 设置repository所在位置
)
public class DataBaseConfig {
	// 配置数据源
	@Autowired
    @Qualifier("dataBaseDataSource")
    private DataSource dataBaseDataSource;

    @Primary
    @Bean(name = "entityManagerFactoryDataBase")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryDataBase(EntityManagerFactoryBuilder builder) {
        return builder
                // 设置数据源
                .dataSource(dataBaseDataSource)
                //设置实体类所在位置.扫描所有带有 @Entity 注解的类
                .packages("com.jpa02.entity")
                // Spring会将EntityManagerFactory注入到Repository之中.有了 EntityManagerFactory之后,
                // Repository就能用它来创建 EntityManager 了,然后 EntityManager 就可以针对数据库执行操作
                .persistenceUnit("databasePersistenceUnit")
                .build();

    }
    
}
