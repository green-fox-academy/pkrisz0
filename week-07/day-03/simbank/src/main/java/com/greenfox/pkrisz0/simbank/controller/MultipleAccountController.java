package com.greenfox.pkrisz0.simbank.controller;

import com.greenfox.pkrisz0.simbank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MultipleAccountController {
    List<BankAccount> accounts = new ArrayList<>(Arrays.asList(
            new BankAccount("Simba", "2000", "lion",true,true),
            new BankAccount("Scar", "20000", "lion", false, false),
            new BankAccount("Zayu", "5000", "bird", true,false),
            new BankAccount("Rafiki", "10000", "mandrill",true,false),
            new BankAccount("Gopher", "500", "gopher",false,false),
            new BankAccount("Simba", "2000", "lion",true,true)
            ));

    @RequestMapping(value="/multipleaccounts")
    public String exerciseOne(Model model){
        model.addAttribute("accounts", accounts);
        return "multipleaccounts";
    }

    @GetMapping("/newaccount")
    public String newAccountForm(Model model) {
        model.addAttribute("account", new BankAccount());
        return "newaccount";
    }

    @PostMapping("/newaccount")
    public String submitNewAccount(@ModelAttribute BankAccount account) {
        accounts.add(account);
        return "redirect:/multipleaccounts";
    }
}
