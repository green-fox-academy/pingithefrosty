package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/show")
    public String show(Model model) {
      BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
      model.addAttribute("bankAccount", bankAccount);
      return "template";
    }
}


/*
  In your controller create the first endpoint called /show
    Instantiate a new BankAccount("Simba", "2000", "lion")*/
