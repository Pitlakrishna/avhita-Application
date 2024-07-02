package com.avhita.avita_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class AvitaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvitaApplication.class, args);
	}
}
