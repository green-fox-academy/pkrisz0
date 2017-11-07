package com.greenfox.pkrisz0.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

        @RequestMapping("/")
        public String index(){
            return "index";
        }
}
