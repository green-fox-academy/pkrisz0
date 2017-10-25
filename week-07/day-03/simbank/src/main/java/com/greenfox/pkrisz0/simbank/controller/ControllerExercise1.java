package com.greenfox.pkrisz0.simbank.controller;


import com.greenfox.pkrisz0.simbank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerExercise1 {

    @RequestMapping(value="/exercise1")
    public String exerciseOne(){
        new BankAccount("Simba", 2000, "lion");
        return "exercise1";
    }
}
