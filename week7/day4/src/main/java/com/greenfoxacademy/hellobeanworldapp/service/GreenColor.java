package com.greenfoxacademy.hellobeanworldapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor{

  public String printColor() {
    return "It is green in color...";
  }
}
