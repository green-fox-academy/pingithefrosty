package com.greenfox.pingithefrosty.pallidaretake.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "warehouse")
public class Clothing {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  @JsonProperty(value = "item_name")
  private String name;
  private String manufacturer;
  private String category;
  private String size;
  @JsonProperty(value = "unit_price")
  private double price;

  public Clothing() {
  }

  public Clothing(String name, String manufacturer, String category, String size, int price) {
    this.name = name;
    this.manufacturer = manufacturer;
    this.category = category;
    this.size = size;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
