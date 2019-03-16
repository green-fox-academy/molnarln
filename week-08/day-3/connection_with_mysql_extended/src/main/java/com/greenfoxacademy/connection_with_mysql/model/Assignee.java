package com.greenfoxacademy.connection_with_mysql.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) //if I use mapped by, the third table will be empty, because the 'todo' table will be doing the matching
    private List<Todo> todos;

    public Assignee() {
        this.todos = new ArrayList<>();
    }

    //todo: initialize variables properly
    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
        this.todos = new ArrayList<>();
    }


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
