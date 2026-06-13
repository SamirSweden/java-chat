package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableScheduling
public class BackenderjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackenderjavaApplication.class, args);
	}

}

