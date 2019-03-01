package com.greenfoxacademy.gfacohorts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebAppController {
    private List<Cohort>cohorts;
    public WebAppController(){
        this.cohorts = new ArrayList<>();

        Cohort cohort1 = new Cohort("Megalotis", "2019. january");
        cohort1.addStudent(new Student("Béla", "male", 23));
        cohort1.addStudent(new Student("Zsolt", "male", 26));
        cohort1.addStudent(new Student("Krisztina", "female", 30));
        cohort1.addStudent(new Student("Eszter", "female", 21));
        cohort1.addStudent(new Student("Tivadar", "male", 33, new Exam("foundation", 3)));

        Cohort cohort2 = new Cohort("Sonicfox", "2019. january");
        cohort2.addStudent(new Student("Béla", "male", 23));
        cohort2.addStudent(new Student("Zsolt", "male", 26));
        cohort2.addStudent(new Student("Krisztina", "female", 30));
        cohort2.addStudent(new Student("Eszter", "female", 21));
        cohort2.addStudent(new Student("Tivadar", "male", 33, new Exam("foundation", 3)));

        cohorts.add(cohort1);
        cohorts.add(cohort2);
    }

    @GetMapping("/cohorts")
    public String listCohorts(Model model) {
        model.addAttribute("list", cohorts);
        return "cohort";
    }

    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("list", cohorts.get(0));
        return "students";
    }
}
