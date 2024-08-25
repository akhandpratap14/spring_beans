package com.Beans.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeansApplication implements CommandLineRunner {

	@Autowired
	Apple app1;
	@Autowired
	Apple app2;

	public static void main(String[] args) {
		SpringApplication.run(BeansApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		app1.eatApple();
		System.out.println("Apple 1 hashcode:" + app1.hashCode());
		app2.eatApple();
		System.out.println("Apple 1 hashcode:" + app2.hashCode());
	}
}
