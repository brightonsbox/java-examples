package com.brightonsbox.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class ExampleController {

    // Example configuration value
    @Value("${example}")
    private String exampleString;
    
    //Setup the class after instantiation
    @PostConstruct
    public void setup() {
        System.out.println("Hello World!");
    }
    
    @RequestMapping(value = "/example", method = RequestMethod.GET)
    public String ping() {
        return exampleString;
    }
}
