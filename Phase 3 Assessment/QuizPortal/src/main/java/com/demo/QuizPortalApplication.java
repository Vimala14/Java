package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan("com.demo")
public class QuizPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizPortalApplication.class, args);
	}

}