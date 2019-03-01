package com.greenfoxacademy.gfacohorts;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String gender;
    private int age;
    private List<Exam> examsPassed;


    public Student(String name, String gender, int age, Exam... passedExam) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.examsPassed = new ArrayList<>();
        for (Exam exam : passedExam) {
            this.examsPassed.add(exam);
        }
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void addExam(Exam examToAdd) {
        examsPassed.add(examToAdd);
    }
}
