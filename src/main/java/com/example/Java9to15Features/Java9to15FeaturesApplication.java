package com.example.Java9to15Features;

import com.example.Java9to15Features.controller.RestController1;
import com.example.Java9to15Features.customBeanScope.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.SimpleThreadScope;
import org.springframework.web.context.request.RequestContextHolder;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class Java9to15FeaturesApplication implements CommandLineRunner {

	@Autowired
	RestController1 restController1;



	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Java9to15FeaturesApplication.class, args);
		GreetingService greetingService = applicationContext.getBean(GreetingService.class);
		System.out.println(greetingService);
		GreetingService greetingService1 = applicationContext.getBean(GreetingService.class);
		System.out.println(greetingService1);

		System.out.println("All registered Scopes are : ");
		for(String scope : applicationContext.getBeanFactory().getRegisteredScopeNames()){
			System.out.println(scope);
		}
		//applicationContext.close();
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

		restController1.Method();

		restController1.Method();

	}
}
