package com.greenfox.pkrisz.todo.repository;

import com.greenfox.pkrisz.todo.model.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepo extends CrudRepository<Assignee, Long> {
}
