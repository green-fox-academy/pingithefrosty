package com.greenfox.pingithefrosty.pallidaexampractice.models;

import java.util.ArrayList;
import java.util.List;

public class Cars {
  private String result;
  private List<Car> data;

  public Cars() {
  }

  public Cars(List<Car> data, String result) {
    this.data = new ArrayList<>();
    this.result = result;
  }

  public List<Car> getData() {
    return data;
  }

  public void setData(List<Car> data) {
    this.data = data;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
}
