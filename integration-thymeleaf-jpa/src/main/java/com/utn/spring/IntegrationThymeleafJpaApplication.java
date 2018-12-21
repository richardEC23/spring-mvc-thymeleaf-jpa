package com.utn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.utn.spring.*"})
public class IntegrationThymeleafJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationThymeleafJpaApplication.class, args);
	}

}

