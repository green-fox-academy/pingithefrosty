package com.example.greenfox.restpractice.restpractice.models.arrayhandler;

import com.example.greenfox.restpractice.restpractice.models.RestResponse;

public class ArrayDecider extends RestResponse {
  private String what;
  private int[] numbers;

  public ArrayDecider() {
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}
