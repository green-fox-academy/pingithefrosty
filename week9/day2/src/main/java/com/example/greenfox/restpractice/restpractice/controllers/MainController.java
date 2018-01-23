package com.example.greenfox.restpractice.restpractice.controllers;

import com.example.greenfox.restpractice.restpractice.models.*;
import com.example.greenfox.restpractice.restpractice.models.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping("/doubling")
  public ResponseEntity<RestResponse> doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      return new ResponseEntity<>(new Doubling(input), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(new Error("Please provide an input!"), HttpStatus.OK);
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity<RestResponse> greeter(@RequestParam(value = "name", required = false) String name,
                                              @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return new ResponseEntity<>(new Error("Please provide a name!"), HttpStatus.OK);
    } else if (title == null) {
      return new ResponseEntity<>(new Error("Please provide a title!"), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(new Greeter(name, title), HttpStatus.OK);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<RestResponse> append(@PathVariable(value = "appendable") String appendable) {
    return new ResponseEntity<>(new Append(appendable), HttpStatus.OK);
  }

  
}

