package com.example.greenfox.restpractice.restpractice.models.dountil;

import com.example.greenfox.restpractice.restpractice.models.RestResponse;

public class DoUntilFactor extends RestResponse {
  private int result;

  public DoUntilFactor() {
  }

  public DoUntilFactor(int result) {
    this.result = repeatingProcess(result);
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  private int repeatingProcess(int t) {
    if (t == 1) {
      return 1;
    }
    return t * repeatingProcess(t - 1);
  }
}
