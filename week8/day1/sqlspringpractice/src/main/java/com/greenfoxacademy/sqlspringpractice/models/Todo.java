package com.greenfoxacademy.sqlspringpractice.models;

import javax.persistence.*;

@Entity
@Table
public class Todo {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private int id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;
  private String todoType;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "name")
  private Assignee assignee;

  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
    isUrgent = false;
    isDone = false;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }

  public String getTodoType() {
    return todoType;
  }

  public void setTodoType(String todoType) {
    this.todoType = todoType;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean getIsUrgent() {
    return isUrgent;
  }

  public void setIsUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean getIsDone() {
    return isDone;
  }

  public void setIsDone(boolean done) {
    isDone = done;
  }


}
