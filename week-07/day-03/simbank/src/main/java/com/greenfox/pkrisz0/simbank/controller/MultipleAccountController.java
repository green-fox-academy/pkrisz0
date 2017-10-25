package com.greenfox.pkrisz0.simbank.controller;

import com.greenfox.pkrisz0.simbank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class MultipleAccountController {
    @RequestMapping(value="/multipleaccounts")
    public String exerciseOne(Model model){
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount("Scar", "20000", "lion", false));
        accounts.add(new BankAccount("Zayu", "5000", "bird", true));
        accounts.add(new BankAccount("Rafiki", "10000", "mandrill",true));
        accounts.add(new BankAccount("Gopher", "500", "gopher",false));
        accounts.add(new BankAccount("Simba", "2000", "lion",true));
        accounts.get(4).setKing(true);
        model.addAttribute("accounts", accounts);
        return "multipleaccounts";
    }
}
