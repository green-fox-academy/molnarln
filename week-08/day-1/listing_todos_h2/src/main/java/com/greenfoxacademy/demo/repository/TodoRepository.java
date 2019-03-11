package com.greenfoxacademy.demo.repository;

import com.greenfoxacademy.demo.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
