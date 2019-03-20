package com.greenfoxacademy.connection_with_mysql.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private boolean urgent;
    private boolean done;
    private String description;
    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    //@JoinColumn(name = "foreign_id")
    private Assignee assignee;

    public Todo() {
        this.date = new Date();
    }

    public Todo(String title, boolean urgent, boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }


    public void setId(long id) {
        this.id = id;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
        assignee.addTodo(this);
    }
    public void nullAssignee(){
        this.assignee = null;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssigneeName() {
        if (this.getAssignee() == null) {
            return "No assignee yet!";
        }
        return this.getAssignee().getName();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}