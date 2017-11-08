package com.greenfox.pkrisz0.frontend.controller;

import com.greenfox.pkrisz0.frontend.model.Errorrer;

import com.greenfox.pkrisz0.frontend.model.Greeting;
import org.springframework.web.bind.MissingServletRequestParameterException;

import org.springframework.web.bind.annotation.*;


@RestController
public class GreetingController {

    @GetMapping(value = "/greeter")
    public Object greeter(@RequestParam (value = "name") String name, @RequestParam (value = "title")  String title){
        return new Greeting(name, title);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Errorrer error(MissingServletRequestParameterException stg){
        String error = stg.getParameterName();
        return new Errorrer("Please provide a " + error + "!");
    }

}
