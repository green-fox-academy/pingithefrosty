package com.example.greenfox.restpractice.restpractice.models.dountil;

import com.example.greenfox.restpractice.restpractice.models.RestResponse;

import javax.validation.constraints.NotNull;

public class DoUntilGet extends RestResponse {

  private int until;

  public DoUntilGet() {
  }

  public DoUntilGet(int until) {
    this.until = until;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }
}