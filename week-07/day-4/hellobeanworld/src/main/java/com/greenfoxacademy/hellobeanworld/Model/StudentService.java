package com.greenfoxacademy.hellobeanworld.Model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private ArrayList<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public Integer count(){
        return this.names.size();
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }
}