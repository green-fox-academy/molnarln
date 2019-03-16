package com.greenfoxacademy.connection_with_mysql;

import com.greenfoxacademy.connection_with_mysql.model.Assignee;
import com.greenfoxacademy.connection_with_mysql.model.Todo;
import com.greenfoxacademy.connection_with_mysql.repository.AssigneeRepository;
import com.greenfoxacademy.connection_with_mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ConnectionWithMysqlApplication implements CommandLineRunner {
    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public ConnectionWithMysqlApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConnectionWithMysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.deleteAll();
        Todo todo1 = new Todo("I have to understand everything", true, true);
        Todo todo2 = new Todo("I have to learn CommandLineRunner", true, false);
        Todo todo3 = new Todo("Repair the car", true, false);
        Todo todo4 = new Todo("I have to learn CommandLineRunner", false, true);
        todoRepository.save(todo1);
        todoRepository.save(todo2);
        todoRepository.save(todo3);
        todoRepository.save(todo4);


        Assignee a = new Assignee("Béla", "bela@gfd.hu");
        Assignee b = new Assignee("Gizi", "gizi@gmail.hu");
        Assignee c = new Assignee("Pista", "pista@freemail.hu");
        Assignee d = new Assignee("Endre", "endre@gfd.hu");

        assigneeRepository.save(a);
        assigneeRepository.save(b);
        assigneeRepository.save(c);
        assigneeRepository.save(d);

        List<Todo> x = new ArrayList<>();
        x.add(todo2);
        x.add(todo3);
        todo2.setAssignee(a);
        todo3.setAssignee(a);

        a.setTodos(x);

        assigneeRepository.save(a);

        //if I don't use cascade at the parent entity, I have to save todo2 and todo3:
        //todoRepository.save(todo2);
        //todoRepository.save(todo3);

    }
}
