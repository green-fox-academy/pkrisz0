package com.greenfox.pkrisz0.spring1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloDiffWebController {

    @RequestMapping("/web/greetingDiff")
    public String withName (Model model) {
        Hellos hello = new Hellos();
        model.addAttribute("hello", hello.content);
        model.addAttribute("col", hello.col);
        return "greetingDiff";
    }
}
