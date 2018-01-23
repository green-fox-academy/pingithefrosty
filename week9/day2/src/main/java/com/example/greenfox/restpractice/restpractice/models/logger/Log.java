package com.example.greenfox.restpractice.restpractice.models.logger;

import com.example.greenfox.restpractice.restpractice.models.RestResponse;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Log extends RestResponse{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String createdAt;
  private String endPoint;
  private String data;

  public Log() {
    this.createdAt = String.valueOf(LocalDateTime.now());
  }

  public Log(String endPoint, String data) {
    this.createdAt = String.valueOf(LocalDateTime.now());
    this.endPoint = endPoint;
    this.data = data;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(String endPoint) {
    this.endPoint = endPoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
