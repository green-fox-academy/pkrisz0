package com.greenfox.pkrisz0.frontend.controller;

import com.greenfox.pkrisz0.frontend.model.Append;
import com.greenfox.pkrisz0.frontend.model.Double;
import com.greenfox.pkrisz0.frontend.model.Error;

import com.greenfox.pkrisz0.frontend.model.Greeting;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.*;


@RestController
public class RESTController {

    @GetMapping(value="/doubling")
    public Object doubling(@RequestParam (required = false) Integer input){
        if (input == null || input == 0){
            Error e = new Error("Please provide an input!");
            return e;
        } else {
            Double d = new Double(input);
            return d;
        }
    }

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

    @GetMapping(value = "/appenda/{appendable}")
    public Object append(@PathVariable String appendable){
        Append a = new Append(appendable);
        return a;
    }
}
