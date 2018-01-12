package com.greenfoxacademy.programmerfoxclub.model;

import java.util.List;

public class Fox {
  private String name;
  private List listOfTricks;
  private String food;
  private String drink;

  public Fox() {
  }

  public Fox(String name, List listOfTricks, String food, String drink) {
    this.name = name;
    this.listOfTricks = listOfTricks;
    this.food = food;
    this.drink = drink;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List getListOfTricks() {
    return listOfTricks;
  }

  public void setListOfTricks(List listOfTricks) {
    this.listOfTricks = listOfTricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
