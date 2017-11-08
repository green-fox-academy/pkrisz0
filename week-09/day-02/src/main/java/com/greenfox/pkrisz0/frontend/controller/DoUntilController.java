package com.greenfox.pkrisz0.frontend.controller;


import com.greenfox.pkrisz0.frontend.model.DoesUntil;
import com.greenfox.pkrisz0.frontend.model.Errorrer;
import com.greenfox.pkrisz0.frontend.model.Until;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

    @PostMapping(value = "/dountil/{what}")
    public Object dountil(@PathVariable("what") String what, @RequestBody Until until){
        if (until.getUntil() == null) {
            return new Errorrer("Please provide a stg!");
        } else {
            return new DoesUntil(what, until.getUntil());
        }
    }
}
