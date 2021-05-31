package com.jpa02;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AccessingDataJpaApplication {

	//private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);
	
	public static void main(String[] args) {
	    SpringApplication.run(AccessingDataJpaApplication.class, args);
	    
//	    BookStock bookStock=new BookStock();
//	    bookStock.setIsbn("ISBN-006");
//	    bookStock.setStock("2000");
//	    jpaBookService.save(bookStock);
	    
//	    BookStock bookStock=new BookStock();
//	    bookStock.setIsbn("ISBN-015");
//	    log.info("-----");
//		Page<BookStock> page=testRepository.search(null);
//		log.info(String.valueOf(page.getTotalPages()));
//		log.info(String.valueOf(page.getPageable()));
//		log.info(page.getContent().toString());
//	    log.info("-----");
	    
	    
	}
	

}