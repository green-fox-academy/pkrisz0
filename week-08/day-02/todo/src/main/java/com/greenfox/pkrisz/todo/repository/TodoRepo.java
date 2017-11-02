package com.greenfox.pkrisz.todo.repository;

import com.greenfox.pkrisz.todo.model.Assignee;
import com.greenfox.pkrisz.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepo extends CrudRepository<Todo, Long> {
    //define queries here, call the methods in controller
    List<Todo> findAllByTitleIsLike(String title);
    List<Todo> findAllByAssigneeName(String name);
}
