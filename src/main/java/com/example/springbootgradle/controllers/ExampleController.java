package com.example.springbootgradle.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	final static Logger logger = LoggerFactory.getLogger(ExampleController.class);

	@RequestMapping("/")
	public String home() {
		logger.debug("Hello Gradle Earth!");
		return "Hello Gradle Earth!";
	}

	@RequestMapping(value = "/mars", method = RequestMethod.GET)
	public String mars() {
		return "Hello Gradle mars!";
	}

}