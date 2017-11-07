package com.greenfox.pkrisz0.frontend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RESTController {

    @GetMapping(value="/doubling")
    public Object doubling(@RequestParam (required = false) Integer input){
        Error e = new Error();

        if (input == null || input == 0){
            return e;
        } else {
            Double d = new Double(input);
            return d;
        }
    }
}
