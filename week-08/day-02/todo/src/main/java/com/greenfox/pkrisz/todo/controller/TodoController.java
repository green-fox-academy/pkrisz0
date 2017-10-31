package com.greenfox.pkrisz.todo.controller;

import com.greenfox.pkrisz.todo.model.Todo;
import com.greenfox.pkrisz.todo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("todo")
public class TodoController {

    @Autowired
    TodoRepo todoRepo;

    @RequestMapping({"/","list"})
    public String list(Model model, @RequestParam(name = "isActive", required = false) Boolean done){
        model.addAttribute("todos", todoRepo.findAll());
        model.addAttribute("done", done);
    return "todo";
    }

//
//    @RequestMapping("/done")
//    public String isDone (Model model, @RequestParam(name = "isActive") boolean done) {
//        model.addAttribute("todos", todoRepo.findAll());
//        model.addAttribute("done", done);
//    return "tododone";
//    }

    @RequestMapping("/add")
    public String add(Model model) {
        model.addAttribute("todo", new Todo());
        return "add";
    }

    @PostMapping("/save")
    public String add(@ModelAttribute Todo todo) {
        todoRepo.save(todo);
        return "redirect:/todo/list";
    }
}
