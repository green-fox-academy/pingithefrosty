package com.greenfoxacademy.sqlspringpractice.services;

import com.greenfoxacademy.sqlspringpractice.models.Assignee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AssigneeService {

  List<Assignee> getAllAssignees();
  Assignee getAssigneeById(int id);
  boolean existsByAssigneeName(String name);
  void register(Assignee assignee);
  void deleteAssignee(Assignee assignee);
}
