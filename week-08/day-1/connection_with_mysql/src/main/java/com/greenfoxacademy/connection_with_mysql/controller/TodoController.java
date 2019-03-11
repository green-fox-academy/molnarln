package com.greenfoxacademy.connection_with_mysql.controller;

import com.greenfoxacademy.connection_with_mysql.model.Todo;
import com.greenfoxacademy.connection_with_mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping(value = {"", "/", "/list"}, method = RequestMethod.GET)
    public String list(Model model, @RequestParam(value = "isActive", required = false) String string) {
        List<Todo> todoList = new ArrayList<>();
        todoRepository.findAll().forEach(todoList::add);

        if (string != null && string.equalsIgnoreCase("true")) {

            List<Todo> onlyActive = todoList.stream()
                    .filter(e -> !e.isDone())
                    .collect(Collectors.toList());
            model.addAttribute("todos", onlyActive);
        }else {

            model.addAttribute("todos", todoRepository.findAll());
        }
        return "todolist";

    }
}
