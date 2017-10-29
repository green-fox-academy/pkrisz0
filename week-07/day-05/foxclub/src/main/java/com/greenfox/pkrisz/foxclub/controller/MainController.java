package com.greenfox.pkrisz.foxclub.controller;

import com.greenfox.pkrisz.foxclub.model.Fox;
import com.greenfox.pkrisz.foxclub.model.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
    @Autowired
    Fox fox;

    @Autowired
    Trick trick;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/information")
    public String info(Model model){
        model.addAttribute("fox", fox);
        return "information";
    }

    @PostMapping("/nutri")
    public String infoPost(@ModelAttribute Fox fox){
        this.fox.setFood(fox.getFood());
        this.fox.setDrink(fox.getDrink());
        return "redirect:/information";
    }

    @RequestMapping("/nutritionstore")
    public String nutri(){
        return "nutritionstore";
    }

    @GetMapping("/trickcenter")
    public String trick(Model model){
        model.addAttribute("sometrick", trick);
        return "trickcenter";
    }

    @PostMapping("/learn")
    public String trickPost(@ModelAttribute Trick trick){
        fox.learn(trick.getName());
        return "redirect:/information";
    }

}
