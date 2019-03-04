package com.greenfoxacademy.gfacohorts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebAppController {
    private List<Cohort>cohorts;
    public WebAppController(){
        this.cohorts = new ArrayList<>();

        Cohort cohort1 = new Cohort("Megalotis", "2019. january");
        cohort1.addStudent(new Student("Béla", "male", 23, new Exam("foundation", 4), new Exam("orientation", 8)));
        cohort1.addStudent(new Student("Zsolt", "male", 26, new Exam("foundation", 4), new Exam("orientation", 8)));
        cohort1.addStudent(new Student("Krisztina", "female", 30));
        cohort1.addStudent(new Student("Eszter", "female", 21));
        cohort1.addStudent(new Student("Tivadar", "male", 33, new Exam("foundation", 3)));

        Cohort cohort2 = new Cohort("Sonicfox", "2019. january");
        cohort2.addStudent(new Student("Dezső", "male", 23));
        cohort2.addStudent(new Student("Ilona", "female", 26));
        cohort2.addStudent(new Student("Balázs", "male", 30));
        cohort2.addStudent(new Student("Eleonóra", "female", 21));
        cohort2.addStudent(new Student("Bence", "male", 33, new Exam("foundation", 3)));

        cohorts.add(cohort1);
        cohorts.add(cohort2);
    }
    @RequestMapping("/test")
    @ResponseBody
    public int test(){
    return (cohorts.get(0).getId());
    }

    @GetMapping("/cohorts")
    public String listCohorts(Model model) {
        model.addAttribute("list", cohorts);
        return "cohorts";
    }

    @GetMapping(value = "/cohorts/{cohortID}/students")
    public String listStudents(Model model, @PathVariable("cohortID") int cohortID){
        model.addAttribute("list", cohorts.get(cohortID).getStudents());
        return "students";
    }

    @GetMapping(value = "/cohorts/{cohortID}/students/{studentID}")
    public String listExams(Model model, @PathVariable("cohortID") int cohortID, @PathVariable("studentID") int studentID){
        model.addAttribute("list", cohorts.get(cohortID).getStudents().get(studentID).getExams());
        return "exams";
    }
}
