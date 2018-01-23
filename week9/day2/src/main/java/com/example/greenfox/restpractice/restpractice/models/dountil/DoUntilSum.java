package com.example.greenfox.restpractice.restpractice.models.dountil;

import com.example.greenfox.restpractice.restpractice.models.RestResponse;

public class DoUntilSum extends RestResponse {
  private int result;

  public DoUntilSum() {
  }

  public DoUntilSum(int result) {
    this.result = result * (result + 1) / 2;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
