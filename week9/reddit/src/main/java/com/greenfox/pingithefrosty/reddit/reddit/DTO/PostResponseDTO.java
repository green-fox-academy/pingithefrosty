package com.greenfox.pingithefrosty.reddit.reddit.DTO;

import com.greenfox.pingithefrosty.reddit.reddit.models.Post;

public class PostResponseDTO {
  private Long id;
  private String title;
  private String url;
  private String timestamp;
  private int score;

  public PostResponseDTO() {
  }

  public PostResponseDTO(Post post) {
    this.id = post.getId();
    this.title = post.getTitle();
    this.url = post.getUrl();
    this.timestamp = post.getTimestamp();
    this.score = post.getScore();
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
