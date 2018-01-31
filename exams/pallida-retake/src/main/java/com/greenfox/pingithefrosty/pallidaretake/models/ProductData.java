package com.greenfox.pingithefrosty.pallidaretake.models;

public class ProductData {
  private String name;
  private String manufacturer;
  private String category;
  private String size;
  private int quantity;
  private double price;

  public ProductData() {
  }

  public ProductData(String name, String manufacturer, String category, String size, int quantity, double price) {
    this.name = name;
    this.manufacturer = manufacturer;
    this.category = category;
    this.size = size;
    this.quantity = quantity;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
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

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
