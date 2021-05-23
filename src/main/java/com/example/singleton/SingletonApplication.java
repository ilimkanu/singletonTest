package com.example.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(User.class);
		User user = context.getBean("getUser", User.class);
		User user1 = (User) context.getBean("getUser");
		User user2 = (User) context.getBean("getUser");
		System.out.println(user1.equals(user2));
	}
}
