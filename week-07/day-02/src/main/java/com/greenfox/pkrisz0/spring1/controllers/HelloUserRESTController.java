package com.greenfox.pkrisz0.spring1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloUserRESTController {
    AtomicLong counter = new AtomicLong(1);

    @RequestMapping(value = "/greeting")
    public Greeting withName (@RequestParam("name") String name) {
        Greeting greeting = new Greeting(counter.getAndIncrement(),"Hello ", name);
        return greeting;
    }
}
