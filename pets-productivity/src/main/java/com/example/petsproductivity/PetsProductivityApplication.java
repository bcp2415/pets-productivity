package com.example.petsproductivity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetsProductivityApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(PetsProductivityApplication.class, args);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
