package com.greenfoxacademy.hellobeanworld.gfaControllers;

import com.greenfoxacademy.hellobeanworld.Model.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GfaController {

    private StudentService studentService;


    @Autowired
    public GfaController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/gfa", method = RequestMethod.GET)
    public String showUtilities(Model model) {
        model.addAttribute("numberofstudents", studentService.count());
        return "gfaindex";
    }

    @RequestMapping(value = "/gfa/list", method = RequestMethod.GET)
    public String showStudents(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "gfastudents";
    }

    @RequestMapping(value = "/gfa/add", method = RequestMethod.GET)
    public String addStudent() {

        return "gfaaddstudent";
    }

    @RequestMapping(value = "/gfa/save", method = RequestMethod.POST)
    public String addStudent(@RequestParam("student") String studentToAdd) {
        studentService.save(studentToAdd);
        return "redirect:/gfa/list";
    }

    @RequestMapping(value = "/gfa/check", method = RequestMethod.GET)
    public String checkStudent(Model model) {
        model.addAttribute("message", "");
        return "gfacheckstudent";
    }

    @RequestMapping(value = "/gfa/check", method = RequestMethod.POST)
    public String checkStudent(@RequestParam String nameToCheck, Model model) {
        Long a = studentService.findAll().stream()
                .filter(i -> i.equalsIgnoreCase(nameToCheck))
                .count();
        if (a > 0) {
            model.addAttribute("message", "The student is already in the list.");
        } else {
            model.addAttribute("message", "The student is not in the list.");
        }

        return "gfacheckstudent";
    }
}
