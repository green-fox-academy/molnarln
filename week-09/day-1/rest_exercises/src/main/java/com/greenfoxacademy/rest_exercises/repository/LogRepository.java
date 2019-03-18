package com.greenfoxacademy.rest_exercises.repository;

import com.greenfoxacademy.rest_exercises.model.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

}
