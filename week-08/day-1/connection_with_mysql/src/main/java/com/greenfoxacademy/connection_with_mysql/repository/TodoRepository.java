package com.greenfoxacademy.connection_with_mysql.repository;

import com.greenfoxacademy.connection_with_mysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
