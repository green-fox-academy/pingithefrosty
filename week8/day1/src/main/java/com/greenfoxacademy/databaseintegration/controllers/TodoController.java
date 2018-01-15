package com.greenfoxacademy.databaseintegration.controllers;

import com.greenfoxacademy.databaseintegration.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value = {"/todo", "/"})
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "list";
  }
}
