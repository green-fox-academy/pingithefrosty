package com.example.greenfox.restpractice.restpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

  @RequestMapping("/")
  public String showIndex() {
    return "index";
  }
}
