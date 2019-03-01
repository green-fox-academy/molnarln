package com.greenfoxacademy.gfacohorts;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private List<Student> students;
    private String name;
    private String startedAt;
    private static int globalID = 0;
    private int cohortID;

    public Cohort(String name, String startedAt) {
        this.name = name;
        this.startedAt = startedAt;
        this.students = new ArrayList<>();
        this.cohortID = globalID;
        this.globalID++;
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

    public int getId() {
        return cohortID;
    }
}
