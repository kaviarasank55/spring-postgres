package com.spring.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringContainerApplication {

	public static void main(String[] args) {
		System.out.println("inside start");
		SpringApplication.run(SpringContainerApplication.class, args);
	}

}
