package com.greenfox.pingithefrosty.pallidaexampractice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "licence_plates")
public class Car {

  @Id
  private String plate;
  @JsonProperty(value = "car_brand")
  private String brand;
  @JsonProperty(value = "car_model")
  private String model;
  @JsonProperty(value = "year")
  private int year;
  @JsonProperty(value = "color")
  private String color;

  public Car() {
  }

  public Car(String plate, String brand, String model, int year, String color) {
    this.plate = plate;
    this.brand = brand;
    this.model = model;
    this.year = year;
    this.color = color;
  }

  public String getPlate() {
    return plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
