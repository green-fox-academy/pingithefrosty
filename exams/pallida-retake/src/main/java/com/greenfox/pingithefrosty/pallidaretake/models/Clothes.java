package com.greenfox.pingithefrosty.pallidaretake.models;

import java.util.ArrayList;
import java.util.List;

public class Clothes {
  private String result;
  private List<Clothing> clothes;

  public Clothes() {
    this.result = "ok";
  }

  public Clothes(List<Clothing> clothes, String result) {
    this.clothes = new ArrayList<>();
    this.result = result;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<Clothing> getClothes() {
    return clothes;
  }

  public void setClothes(List<Clothing> clothes) {
    this.clothes = clothes;
  }
}
