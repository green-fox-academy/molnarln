package com.greenfoxacademy.connection_with_mysql.service;

import com.greenfoxacademy.connection_with_mysql.repository.TodoRepository;
import org.springframework.stereotype.Component;

@Component
public class TodoService {
    private TodoRepository todoRepository;

}
