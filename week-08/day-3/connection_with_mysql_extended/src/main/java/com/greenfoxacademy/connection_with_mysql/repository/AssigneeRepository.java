package com.greenfoxacademy.connection_with_mysql.repository;

import com.greenfoxacademy.connection_with_mysql.model.Assignee;
import com.greenfoxacademy.connection_with_mysql.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
     Assignee findByName(String name);
}
