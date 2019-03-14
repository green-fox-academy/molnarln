package com.greenfoxacademy.connection_with_mysql.repository;

import com.greenfoxacademy.connection_with_mysql.model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
