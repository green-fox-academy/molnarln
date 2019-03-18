package com.greenfoxacademy.rest_exercises.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.print.attribute.standard.DateTimeAtCompleted;
import java.text.DateFormat;
import java.util.Date;

@Entity
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date createdAt;
    private String endpoint;
    private String data;

    public Log() {
        this.createdAt = new Date();
    }

    public Log(String endpoint, String data) {
        this.createdAt = new Date();
        this.endpoint = endpoint;
        this.data = data;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
