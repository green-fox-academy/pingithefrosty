package com.greenfoxacademy.sqlspringpractice.repositories;

import com.greenfoxacademy.sqlspringpractice.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
