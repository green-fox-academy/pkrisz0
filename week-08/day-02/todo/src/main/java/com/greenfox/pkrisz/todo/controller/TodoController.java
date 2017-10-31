package com.greenfox.pkrisz.todo.controller;

import com.greenfox.pkrisz.todo.model.Todo;
import com.greenfox.pkrisz.todo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    TodoRepo todoRepo;

    @RequestMapping({"/","list"})
    public String list(Model model, @RequestParam(name = "isActive", required = false) Boolean done){
        model.addAttribute("todos", todoRepo.findAll());
        model.addAttribute("done", done);
    return "todo";
    }

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

    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable long id) {
        todoRepo.delete(id);
        return "redirect:/todo/list";
    }
}
