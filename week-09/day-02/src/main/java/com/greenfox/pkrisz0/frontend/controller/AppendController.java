package com.greenfox.pkrisz0.frontend.controller;

import com.greenfox.pkrisz0.frontend.model.Append;

import org.springframework.web.bind.annotation.*;

@RestController
public class AppendController {

    @GetMapping(value = "/appenda/{appendable}")
    public Object append(@PathVariable String appendable){
        Append a = new Append(appendable);
        return a;
    }
}