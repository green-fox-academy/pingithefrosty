package com.greenfoxacademy.sqlspringpractice.models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table
public class Assignee {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private int id;
  private String role;
  @Column(unique = true, nullable = false)
  private String name;
  private String password;
  @OneToMany(mappedBy = "assignee", fetch = FetchType.EAGER)
  private List<Todo> todos;


  public Assignee() {
  }

  public Assignee(String role, String name, String password) {
    this.role = role;
    this.name = name;
    this.password = password;
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
