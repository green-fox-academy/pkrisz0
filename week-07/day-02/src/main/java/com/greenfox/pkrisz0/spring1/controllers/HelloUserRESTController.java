package com.greenfox.pkrisz0.spring1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloUserRESTController {

    @RequestMapping(value = "/greeting")
    public Greeting withName (@RequestParam("name") String name) {
        Greeting greeting = new Greeting(1,"Hello ", name);
        return greeting;
    }
}
