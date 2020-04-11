package com.example.swaggerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerDemoController {
	
	 // Method will only be accessed by the user who has 'admin' role attached to it.
    @GetMapping(value="/getmsg")
    public String getmsg() {
        System.out.println(getClass() + "- showing admin welcome page to the user.");
        return "Spring security - Role based access example!";
    }
    @GetMapping(value="/getInfo")
    public String getInfo() {
        System.out.println(getClass() + "- showing admin welcome page to the user.");
        return "get Info method calling from Mycontroller";
    }

}
