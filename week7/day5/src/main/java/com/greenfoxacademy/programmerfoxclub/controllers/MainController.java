package com.greenfoxacademy.programmerfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @RequestMapping(value = "/")
  public String mainPage(Model model) {
    return "index";
  }

  @GetMapping(value = "/login")
  public String getLogin(Model model) {
    return "login";
  }

  @PostMapping(value = "/login")
  public String postLogin(@RequestParam(value = "name") String foxName, Model model) {
    return "login";
  }
}
