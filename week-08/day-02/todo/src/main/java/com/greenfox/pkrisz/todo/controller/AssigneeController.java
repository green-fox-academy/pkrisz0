package com.greenfox.pkrisz.todo.controller;

import com.greenfox.pkrisz.todo.model.Assignee;
import com.greenfox.pkrisz.todo.model.Todo;
import com.greenfox.pkrisz.todo.repository.AssigneeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/assignee")
public class AssigneeController {

    @Autowired
    AssigneeRepo assigneeRepo;

    @GetMapping({"","/","list"})
    public String list(Model model){
        model.addAttribute("assignees", assigneeRepo.findAll());
        return "assignee";
    }

    @PostMapping({"/","list"})
    public String save(@ModelAttribute Assignee assignee){
        assigneeRepo.save(assignee);
        return "redirect:/assignee/list";
    }

    @GetMapping("/{id}/edit")
    public String editEntry(@PathVariable long id, Model model){
        model.addAttribute("editedAss", assigneeRepo.findOne(id));
        return "editassignee";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("assignee", new Assignee());
        return "addassignee";
    }

    @DeleteMapping(value="/{id}/delete")
    public String delete(@PathVariable long id) {
        assigneeRepo.delete(id);
        return "redirect:/assignee/list";
    }
}
