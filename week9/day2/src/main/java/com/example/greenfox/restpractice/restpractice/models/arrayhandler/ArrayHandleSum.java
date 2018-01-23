package com.example.greenfox.restpractice.restpractice.models.arrayhandler;

import com.example.greenfox.restpractice.restpractice.models.RestResponse;

import java.util.stream.IntStream;

public class ArrayHandleSum extends RestResponse {
  private int result;

  public ArrayHandleSum() {
  }

  public ArrayHandleSum(int[] numbers) {
    this.result = sum(numbers);
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  private int sum(int[] numbers) {
    return IntStream.of(numbers).sum();
  }
}
