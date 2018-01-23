package com.example.greenfox.restpractice.restpractice.models.arrayhandler;

import com.example.greenfox.restpractice.restpractice.models.RestResponse;

public class ArrayHandleDouble extends RestResponse {
  private int[] result;

  public ArrayHandleDouble() {
  }

  public ArrayHandleDouble(int[] numbers) {
    this.result = doubleArray(numbers);
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }

  private int[] doubleArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = numbers[i] * 2;
    }
    return numbers;
  }
}
