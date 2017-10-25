package com.greenfox.pkrisz0.simbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLceptionController {
    @RequestMapping(value="/htmlception")
    public String exerciseOne(Model model){
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "htmlception";
    }
}
