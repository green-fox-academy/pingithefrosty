package com.greenfoxacademy.springintro.controllers;

import com.greenfoxacademy.springintro.models.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRestController {

  AtomicLong atomicLong = new AtomicLong(0);

  @RequestMapping(value = "/greeting", method = RequestMethod.GET)
  public Greeting personalGreeting(Model model, @RequestParam(value = "name", required = false) String name) {
    return new Greeting((int) atomicLong.addAndGet(1), "Hello, " + name);
  }

}
