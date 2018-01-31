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
import com.example.greenfox.restpractice.restpractice.models.logger.Log;
import com.example.greenfox.restpractice.restpractice.models.logger.LogPages;
import com.example.greenfox.restpractice.restpractice.models.logger.LogResponse;
import com.example.greenfox.restpractice.restpractice.services.LogServiceImpl;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

  private final LogServiceImpl logService;

  @Autowired
  @JsonIgnore
  public MainController(LogServiceImpl logService) {
    this.logService = logService;
  }

  @GetMapping("/doubling")
  public ResponseEntity<RestResponse> doubling(@RequestParam(value = "input", required = false) Integer input) {
    String endpoint = "/doubling";
    String data;
    Log log = new Log();
    log.setEndPoint(endpoint);

    if (input != null) {
      data = "input=" + input;
      log.setData(data);
      logService.save(log);
      return new ResponseEntity<>(new Doubling(input), HttpStatus.OK);
    } else {
      data = "";
      log.setData(data);
      logService.save(log);
      return new ResponseEntity<>(new Error("Please provide an input!"), HttpStatus.OK);
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity<RestResponse> greeter(@RequestParam(value = "name", required = false) String name,
                                              @RequestParam(value = "title", required = false) String title) {
    String endpoint = "/greeter";
    String data;
    Log log = new Log();
    log.setEndPoint(endpoint);

    if (name == null) {
      data = null;
      log.setData(data);
      logService.save(log);
      return new ResponseEntity<>(new Error("Please provide a name!"), HttpStatus.OK);
    } else if (title == null) {
      data = null;
      log.setData(data);
      logService.save(log);
      return new ResponseEntity<>(new Error("Please provide a title!"), HttpStatus.OK);
    } else {
      data = "name=" + name + "&title=" + title;
      log.setData(data);
      logService.save(log);
      return new ResponseEntity<>(new Greeter(name, title), HttpStatus.OK);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<RestResponse> append(@PathVariable(value = "appendable") String appendable) {
    Log log = new Log("/appends/{appendable}", "appendable=" + appendable);
    logService.save(log);
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
      return new ResponseEntity<>(new Error("Please provide a number!"), HttpStatus.BAD_REQUEST);
    }
  }

  @PostMapping("/arrays")
  public ResponseEntity<RestResponse> arrayHandler(@RequestBody ArrayDecider arrayDecider) {
    String what = arrayDecider.getWhat();
    int[] numbers = arrayDecider.getNumbers();
    if ("double".equals(what)) {
      return new ResponseEntity<>(new ArrayHandleDouble(numbers), HttpStatus.OK);
    } else if ("multiply".equals(what)) {
      return new ResponseEntity<>(new ArrayHandleMultiply(numbers), HttpStatus.OK);
    } else if ("sum".equals(what)) {
      return new ResponseEntity<>(new ArrayHandleSum(numbers), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(new Error("Please provide what to do with the numbers!"), HttpStatus.BAD_REQUEST);
    }
  }

  @GetMapping("/log")
  public ResponseEntity<RestResponse> logger(@RequestParam(value = "count", required = false) Integer count,
                                             @RequestParam(value = "page", required = false) Integer page,
                                             @RequestParam(value = "q", required = false) String q) {
    if (count == null || page == null) {
      return new ResponseEntity<>(new LogResponse(logService), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(new LogPages(logService, page, count), HttpStatus.OK);
    }
  }
}

