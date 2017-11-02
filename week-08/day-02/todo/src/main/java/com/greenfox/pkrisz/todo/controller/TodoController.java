package com.greenfox.pkrisz.todo.controller;

import com.greenfox.pkrisz.todo.model.Assignee;
import com.greenfox.pkrisz.todo.model.Todo;
import com.greenfox.pkrisz.todo.repository.AssigneeRepo;
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

    @Autowired
    AssigneeRepo assigneeRepo;

    @GetMapping({"","/","list"})
    public String list(Model model, @RequestParam(name = "isActive", required = false) Boolean done, @RequestParam (required = false) String search){
        model.addAttribute("todos", todoRepo.findAll());
        model.addAttribute("done", done);

        if (search != null) {
            model.addAttribute("todos", todoRepo.findAllByTitleIsLike("%" + search + "%"));
        }



    return "todo";
    }

    @PostMapping({"/","list"})
    public String save(@ModelAttribute Todo todo){
        todoRepo.save(todo);
        return "redirect:/todo/list";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("todo", new Todo());
        return "add";
    }

    @DeleteMapping(value="/{id}/delete")
    public String delete(@PathVariable long id) {
        todoRepo.delete(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String editEntry(@PathVariable long id, Model model){
        model.addAttribute("editedTodo", todoRepo.findOne(id));
        model.addAttribute("assignees", assigneeRepo.findAll());
        model.addAttribute("id", id);
        return "edit";
    }
}
