package com.greenfoxacademy.connection_with_mysql.controller;

import com.greenfoxacademy.connection_with_mysql.model.Todo;
import com.greenfoxacademy.connection_with_mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
        } else {

            model.addAttribute("todos", todoRepository.findAll());
        }
        return "todolist";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAddForm(Model model) {
        model.addAttribute("todo", new Todo());
        return "addtodo";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addNewTodo(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public String deleteTodo(@PathVariable("id") Long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/";
    }

    @RequestMapping(value = "/{id}/update", method = RequestMethod.GET)
    public String showUpdateView(@PathVariable("id") Long id, Model model) {
        model.addAttribute("todo", todoRepository.findById(id).orElseThrow(NullPointerException::new));
        return "update";
    }

    @RequestMapping(value = "/{id}/update", method = RequestMethod.POST)
    public String updateTodo(@PathVariable Long id, Todo todo) {
        Todo todoToUpdate = todoRepository.findById(id).get();
        todoToUpdate.setTitle(todo.getTitle());
        todoToUpdate.setDone(todo.isDone());
        todoToUpdate.setUrgent(todo.isUrgent());
        todoRepository.save(todoToUpdate);
        return "redirect:/todo/";
    }
}
