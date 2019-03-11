package com.greenfoxacademy.demo;

import com.greenfoxacademy.demo.Model.Todo;
import com.greenfoxacademy.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingTodosH2Application implements CommandLineRunner {
    private TodoRepository todoRepository;

    @Autowired
    public ListingTodosH2Application(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ListingTodosH2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping", true, false));
        todoRepository.save(new Todo("I have to understand everything", true, false));
        todoRepository.save(new Todo("I have to learn CommandLineRunner", true, false));
    }
}
