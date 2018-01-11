package com.greenfoxacademy.hellobeanworldapp.controller;

import com.greenfoxacademy.hellobeanworldapp.service.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilitiesController {

  @RequestMapping(value = "/useful")
  public String container(Model model) {
    model.addAttribute("utils", UtilityService.getColors());
    return "utility";
  }
}
