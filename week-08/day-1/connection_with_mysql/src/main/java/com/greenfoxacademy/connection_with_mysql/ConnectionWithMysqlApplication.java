package com.greenfoxacademy.connection_with_mysql;

import com.greenfoxacademy.connection_with_mysql.model.Todo;
import com.greenfoxacademy.connection_with_mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMysqlApplication implements CommandLineRunner {
    private TodoRepository todoRepository;

    public ConnectionWithMysqlApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConnectionWithMysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.deleteAll();
        todoRepository.save(new Todo("I have to learn Object Relational Mapping", true, false));
        todoRepository.save(new Todo("I have to understand everything", true, true));
        todoRepository.save(new Todo("I have to learn CommandLineRunner", true, false));
        todoRepository.save(new Todo("Repair the car", true, false));
        todoRepository.save(new Todo("I have to learn CommandLineRunner", false, true));
    }
}
