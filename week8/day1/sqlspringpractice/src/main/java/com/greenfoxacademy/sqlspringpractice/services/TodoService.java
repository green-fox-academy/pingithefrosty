package com.greenfoxacademy.sqlspringpractice.services;

import com.greenfoxacademy.sqlspringpractice.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

  List<Todo> getAllTodos();
  Todo getTodo(Integer id);
  void create(Todo todo);
  void setTitle(Integer id, String string);
  void setDone(Integer id, boolean input);
  void setUrgent(Integer id, boolean input);
  void delete(Integer id);
}