package com.greenfoxacademy.connection_with_mysql.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    /*@OneToMany (cascade = CascadeType.ALL, mappedBy = "assignee")*/
//    private List<Todo> todos;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Todo> todos;

    public Assignee() {
    }

    //todo: initialize variables properly
    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }

   /* public List<Todo> getTodos() {
        return todos;
    }

    public void setTodo(Todo todo) {
        this.todos.add(todo);
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }
}
