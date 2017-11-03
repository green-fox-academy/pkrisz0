package com.greenfox.pkrisz0.reddit.controller;


import com.greenfox.pkrisz0.reddit.model.Post;
import com.greenfox.pkrisz0.reddit.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostRepo postRepo;

    @GetMapping({"","/","list"})
    public String list(Model model){
        model.addAttribute("posts", postRepo.findAll());
        return "posts";
    }

    @PostMapping({"/","list"})
    public String save(@ModelAttribute Post post){
        postRepo.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("post", new Post() );
        return "add";
    }
}
