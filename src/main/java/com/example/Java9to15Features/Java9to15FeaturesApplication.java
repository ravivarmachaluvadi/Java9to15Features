package com.example.Java9to15Features;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java9to15FeaturesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Java9to15FeaturesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(" ".isEmpty());


	}
}
