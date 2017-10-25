package com.greenfox.pkrisz0.simbank.controller;


import com.greenfox.pkrisz0.simbank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewAccountController {
    @GetMapping("/newaccount")
    public String greetingForm(Model model) {
        model.addAttribute("account", new BankAccount());
        return "newaccount";
    }

    @PostMapping("/newaccount")
    public String greetingSubmit(@ModelAttribute BankAccount account) {
        return "result";
    }
}
