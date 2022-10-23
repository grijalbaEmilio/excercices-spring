package com.example.obsprindatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSprindatajpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSprindatajpaApplication.class, args);

		User oLuis = new User(null, "Luis", "luis@hotmail.com");
		System.out.println(oLuis.getId());
	}

}
