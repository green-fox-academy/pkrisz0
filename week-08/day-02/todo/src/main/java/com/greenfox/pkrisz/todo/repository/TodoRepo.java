package com.greenfox.pkrisz.todo.repository;

import com.greenfox.pkrisz.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo, Long> {

}
