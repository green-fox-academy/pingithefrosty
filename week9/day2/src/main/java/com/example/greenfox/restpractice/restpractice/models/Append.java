package com.example.greenfox.restpractice.restpractice.models;

public class Append extends RestResponse {
  private String appended;

  public Append() {
  }

  public Append(String appended) {
    this.appended = appended + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
