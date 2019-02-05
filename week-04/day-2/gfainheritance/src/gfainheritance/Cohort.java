package gfainheritance;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    String name;
    List<Student> students;
    List<Mentor> mentors;

    public Cohort (String name) {
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();

    }

    public void addStudent (Student studentToAdd) {
        students.add(studentToAdd);
    }

    public void addMentor (Mentor mentorToAdd) {
        mentors.add(mentorToAdd);
    }

    public void info () {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }

}
