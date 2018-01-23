package com.example.greenfox.restpractice.restpractice.controllers;

import com.example.greenfox.restpractice.restpractice.models.*;
import com.example.greenfox.restpractice.restpractice.models.Error;
import com.example.greenfox.restpractice.restpractice.models.arrayhandler.ArrayDecider;
import com.example.greenfox.restpractice.restpractice.models.arrayhandler.ArrayHandleDouble;
import com.example.greenfox.restpractice.restpractice.models.arrayhandler.ArrayHandleMultiply;
import com.example.greenfox.restpractice.restpractice.models.arrayhandler.ArrayHandleSum;
import com.example.greenfox.restpractice.restpractice.models.dountil.DoUntilFactor;
import com.example.greenfox.restpractice.restpractice.models.dountil.DoUntilGet;
import com.example.greenfox.restpractice.restpractice.models.dountil.DoUntilSum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping("/dountil/{what}")
  public ResponseEntity<RestResponse> doUntil(@PathVariable(value = "what") String what,
                                              @RequestBody DoUntilGet doUntilGet) {
    Integer input = doUntilGet.getUntil();
    if (what.equals("sum")) {
      return new ResponseEntity<>(new DoUntilSum(input), HttpStatus.OK);
    } else if (what.equals("factor")) {
      return new ResponseEntity<>(new DoUntilFactor(input), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(new Error("Please provide a number!"), HttpStatus.OK);
    }
  }

  @PostMapping("/arrays")
  public ResponseEntity<RestResponse> arrayHandler(@RequestBody ArrayDecider arrayDecider) {
    String what = arrayDecider.getWhat();
    int[] numbers = arrayDecider.getNumbers();
    if (what.equals("double")) {
      return new ResponseEntity<>(new ArrayHandleDouble(numbers), HttpStatus.OK);
    } else if (what.equals("multiply")) {
      return new ResponseEntity<>(new ArrayHandleMultiply(numbers), HttpStatus.OK);
    } else if (what.equals("sum")) {
      return new ResponseEntity<>(new ArrayHandleSum(numbers), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(new Error("Please provide what to do with the numbers!"), HttpStatus.BAD_REQUEST);
    }
  }
}

