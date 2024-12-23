package com.sonartest.sonartest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonartestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonartestApplication.class, args);
		System.out.println("Test");
	}

}
