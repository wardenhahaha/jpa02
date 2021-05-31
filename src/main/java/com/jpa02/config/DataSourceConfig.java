package com.jpa02.config;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableConfigurationProperties({ DataBaseProperties.class })
public class DataSourceConfig {
	private static final Logger log = LoggerFactory.getLogger(DataSourceConfig.class);
	@Autowired
    private DataBaseProperties dataBaseProperties;
	
	@Bean
    public DataSource dataBaseDataSource(){
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(dataBaseProperties.getUrl());
        dataSource.setUsername(dataBaseProperties.getUsername());
        dataSource.setPassword(dataBaseProperties.getPassword());
        dataSource.setDriverClassName(dataBaseProperties.getDriverClassName());
        log.info("DataSource has been initialized");
        dataSource.setMinimumIdle(5);
        dataSource.setMaximumPoolSize(15);
        dataSource.setIdleTimeout(30000L);
        dataSource.setMaxLifetime(120000L);
        return dataSource;
    }
}
