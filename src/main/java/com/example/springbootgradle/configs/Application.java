package com.example.springbootgradle.configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * This main class needs to be in the same package with the controllers, else
 * you need to utilize @ComponentScan and define your package/s explicitly
 */

@SpringBootApplication
@ComponentScan({"com.example.springbootgradle"})
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
