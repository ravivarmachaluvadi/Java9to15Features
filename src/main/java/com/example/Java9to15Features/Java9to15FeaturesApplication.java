package com.example.Java9to15Features;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class Java9to15FeaturesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Java9to15FeaturesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(" ".isEmpty()); //false
		System.out.println(" ".isBlank()); //true

		Stream.of(1,2,3,4,5,6,7,8,9,10).takeWhile(i -> i < 5)
				.forEach(System.out::println);

		String str = "JD" +
				"JD" +
				"JD";
		System.out.println(str);
		System.out.println(str.lines().collect(Collectors.toList()));


	}
}
