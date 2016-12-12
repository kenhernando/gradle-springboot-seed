package com.example.springbootgradle.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootgradle.service.PlanetService;

@RestController
public class ExampleController {
	
	final static Logger logger = LoggerFactory.getLogger(ExampleController.class);
	
    @Autowired
    private PlanetService planetService;
	
	@RequestMapping("/")
	public String home() {
		logger.debug("Hello Gradle Earth!");
		return "Hello Gradle Earth!";
	}

	@RequestMapping(value = "/mars", method = RequestMethod.GET)
	public String mars() {
		String planet = planetService.retrievePlanetMars();
		return "Hello Gradle " + planet + "!";
	}

}