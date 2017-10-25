package com.greenfox.pkrisz0.simbank.controller;


import com.greenfox.pkrisz0.simbank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class ControllerExercise1 {

    @RequestMapping(value="/exercise1")
    public String exerciseOne(Model model){
        BankAccount one = new BankAccount("Simba", "2000", "lion");
        model.addAttribute("name", one.getName());
        model.addAttribute("balance", one.getBalance());
        model.addAttribute("animalType", one.getAnimalType());
        model.addAttribute("currency", one.getCurrency());
        return "exercise1";
    }
}
