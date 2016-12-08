package com.example.springbootgradle.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @RequestMapping("/")
    String home() {
        return "Hello Gradle Earth!";
    }
    
    @RequestMapping(value = "/mars", method = RequestMethod.GET)
    String mars() {
        return "Hello Gradle mars!";
    }

}