package com.greenfox.pkrisz0.frontend.controller;

import com.greenfox.pkrisz0.frontend.model.Double;
import com.greenfox.pkrisz0.frontend.model.Error;
import org.springframework.web.bind.annotation.*;


@RestController
public class RESTController {

    @GetMapping(value="/doubling")
    public Object doubling(@RequestParam (required = false) Integer input){
        if (input == null || input == 0){
            return new Error("Please provide an input!");
        } else {
            return new Double(input);
        }
    }
}
