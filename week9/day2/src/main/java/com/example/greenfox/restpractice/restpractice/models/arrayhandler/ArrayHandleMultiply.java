package com.example.greenfox.restpractice.restpractice.models.arrayhandler;

import com.example.greenfox.restpractice.restpractice.models.RestResponse;

import java.util.Arrays;

public class ArrayHandleMultiply extends RestResponse {
  private int result;

  public ArrayHandleMultiply() {
  }

  public ArrayHandleMultiply(int[] numbers) {
    this.result = multiply(numbers);
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  private int multiply(int[] numbers) {
    return Arrays.stream(numbers).reduce(1, (a, b) -> (a * b));
  }
}
