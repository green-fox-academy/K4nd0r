package com.greenfox.todo.controller;

import com.greenfox.todo.model.ToDo;
import com.greenfox.todo.service.ToDoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class ToDoController{

  private ToDoService service;

  public ToDoController(ToDoService service) {
    this.service = service;
  }

  @GetMapping(value={"/list"})
  public String list(Model model) {
    model.addAttribute("todos", ToDoService.getToDoList());
    return "index";
  }
}

