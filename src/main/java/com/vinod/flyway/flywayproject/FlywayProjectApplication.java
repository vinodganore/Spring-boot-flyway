package com.vinod.flyway.flywayproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlywayProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlywayProjectApplication.class, args);
		System.out.println("Exiting from main class");
		System.exit(0);
	}

}
