package com.greenfoxacademy.sqlspringpractice.controllers;

import com.greenfoxacademy.sqlspringpractice.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

  @Autowired
  AssigneeService assigneeService;

  @GetMapping("")
  public String loginPage(Model model) {
    return "login";
  }

  @PostMapping("/register")
  public String register(Model model, HttpServletRequest request) {
    String result;
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String confirmpassword = request.getParameter("confirmpassword");

    if(assigneeService.exists)

    return "list";
  }

  @PostMapping("/login")
  public String login(Model model) {
    return "list";
  }

}
