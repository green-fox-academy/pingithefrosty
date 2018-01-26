package com.greenfox.pingithefrosty.reddit.reddit.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table
@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String title;
  private String url;
  private String timestamp;
  private int score;

  public Post() {
  }

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
    this.timestamp = String.valueOf(LocalDateTime.now());
    this.score = 0;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
