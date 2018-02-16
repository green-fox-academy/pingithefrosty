package com.greenfoxacademy.sqlspringpractice.services;

import com.greenfoxacademy.sqlspringpractice.models.Assignee;
import com.greenfoxacademy.sqlspringpractice.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeService {

  @Autowired
  AssigneeRepository assigneeRepository;

  @Override
  public List<Assignee> getAllAssignees() {
    return (List<Assignee>) assigneeRepository.findAll();
  }

  @Override
  public Assignee getAssigneeById(int id) {
    return assigneeRepository.findOne(id);
  }

  @Override
  public boolean existsByAssigneeName(String name) {
    assigneeRepository.findOne()
    return false;
  }

  @Override
  public void register(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  @Override
  public void deleteAssignee(Assignee assignee) {
    assigneeRepository.delete(assignee);
  }
}
