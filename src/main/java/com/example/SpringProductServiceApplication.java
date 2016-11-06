package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
//@EnableCaching
public class SpringProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductServiceApplication.class, args);
	}
	
}
