package com.greenfoxacademy.gfacohorts;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String gender;
    private int age;
    private List<Exam> exams;
    private static int globalID;
    private int studentID;


    public Student(String name, String gender, int age, Exam... passedExam) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.exams = new ArrayList<>();
        for (Exam exam : passedExam) {
            this.exams.add(exam);
        }
        this.studentID = globalID;
        this.globalID++;
    }

    public int getStudentID() {
        return studentID;
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
        exams.add(examToAdd);
    }

    public List<Exam> getExams() {
        return exams;
    }
}
