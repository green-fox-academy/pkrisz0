package com.greenfox.pkrisz0.frontend.controller;


import com.greenfox.pkrisz0.frontend.model.DoesUntil;
import com.greenfox.pkrisz0.frontend.model.Until;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public Error error(HttpMessageNotReadableException e){
        return new Error("Please provide a number!");
    }

    @PostMapping(value = "/dountil/{what}")
    public DoesUntil dountil(@PathVariable("what") String what, @RequestBody Until until){
        return new DoesUntil(what, until.getUntil());
    }


}
