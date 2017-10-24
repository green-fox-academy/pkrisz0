package com.greenfox.pkrisz0.spring1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    AtomicLong counter = new AtomicLong(1);

    @RequestMapping("/web/greeting")
    public String withName (Model model,@RequestParam("name") String name) {
        model.addAttribute("name", name);
        model.addAttribute("id", counter.getAndIncrement());
        return "greeting";
    }
}
