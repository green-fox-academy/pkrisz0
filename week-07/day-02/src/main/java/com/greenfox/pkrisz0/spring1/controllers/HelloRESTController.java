package com.greenfox.pkrisz0.spring1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

   @RequestMapping(value="/greetings")
    public Greeting helloThere(){
        Greeting greeting = new Greeting(1,"Hello, World!");
       return greeting;
    }
}
