package com.example.springbootgradle.configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * Change parameter in @ComponentScan as you define your package/s
 * You may also put this class in the same package with the controllers to remove the @ComponentScan annotation. 
 */

@SpringBootApplication
@ComponentScan({"com.example.springbootgradle"})
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
