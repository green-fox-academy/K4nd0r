package com.gf.listingsql.controller;

import com.gf.listingsql.model.ToDo;
import com.gf.listingsql.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/todo")
public class ToDoController {
  ToDoService service;

  @Autowired
  public ToDoController(ToDoService service) {
    this.service = service ;
  }

  @GetMapping(value={"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", service.getToDoList());
    return "todolist";
  }

  @GetMapping("/active")
  public String activeTodos(Model model) {
    model.addAttribute("todos", this.service.getToDoList()
        .stream()
        .filter(todo -> !todo.isDone())
        .collect(Collectors.toList()));
    return "main";
  }

  @GetMapping("/add-todo")
  public String addTodo(Model model) {
    model.addAttribute("todo", new ToDo());
    return "add-todo";
  }

  @PostMapping("/add-todo")
  public String addTodo(@ModelAttribute ToDo todo) {
    this.service.addToDo(todo);
    return "redirect:/todo";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable long id) {
    service.deleteToDoById(id);
    return "redirect:/todo";
  }

  @GetMapping("/{id}/edit")
  public String editTodo(@PathVariable long id, Model model) {
    model.addAttribute("todo", service.getToDoBy(id));
    return "edit-todo";
  }

  @PostMapping("/{id}/edit")
  public String editTodo(@ModelAttribute("todo") ToDo todo) {
    service.addToDo(todo);
    return "redirect:/todo";
  }

}
