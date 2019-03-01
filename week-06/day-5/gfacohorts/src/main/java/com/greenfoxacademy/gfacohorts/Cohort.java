package com.greenfoxacademy.gfacohorts;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private List<Student> students;
    private String name;
    private String startedAt;

    public Cohort(String name, String startedAt) {
        this.name = name;
        this.startedAt = startedAt;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void addStudent(Student studentToAdd) {
        students.add(studentToAdd);
    }

    public List<Student> getStudents() {
        return students;
    }
}
