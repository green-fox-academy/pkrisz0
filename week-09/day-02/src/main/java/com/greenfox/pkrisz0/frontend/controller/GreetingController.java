package com.greenfox.pkrisz0.frontend.controller;

import com.greenfox.pkrisz0.frontend.model.Error;

import com.greenfox.pkrisz0.frontend.model.Greeting;
import org.springframework.web.bind.MissingServletRequestParameterException;

import org.springframework.web.bind.annotation.*;


@RestController
public class GreetingController {

    @GetMapping(value = "/greeter")
    public Object greeter(@RequestParam (value = "name") String name, @RequestParam (value = "title")  String title){
        Greeting g = new Greeting(name, title);
        return g;
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Error error(MissingServletRequestParameterException stg){
        String error = stg.getParameterName();
        return new Error("Please provide a " + error + "!");
    }

}