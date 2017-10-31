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
public class TodoController {

    @Autowired
    TodoRepo todoRepo;

    @RequestMapping({"/","list"})
    public String list(Model model){
        model.addAttribute("todos", todoRepo.findAll());
    return "todo";
    }

    @RequestMapping("/todo")
    public String isDone (Model model, @RequestParam("isActive") boolean done) {
        model.addAttribute("todos", todoRepo.findAll());
        model.addAttribute("done", done);
    return "tododone";
    }

//    @PostMapping("/addnew")
//    public String addNew() {
//        return "redirect:/add";
//    }

    @RequestMapping("/add")
    public String add(Model model) {
        model.addAttribute("todo", new Todo());
        return "add";
    }

    @PostMapping("/save")
    public String add(@ModelAttribute Todo todo) {
        todoRepo.save(todo);
        return "redirect:/list";
    }
}
