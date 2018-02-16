package com.greenfoxacademy.sqlspringpractice.repositories;

import com.greenfoxacademy.sqlspringpractice.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Integer> {


}
