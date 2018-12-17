package com.greenfox.todo.controller;

import com.greenfox.todo.service.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class ToDoController {
//  Create a new controller called TodoController which maps to /todo
//  Add a public String list() method which maps to
// / and /list in the controller, which returns with "This is my first Todo" string. Use the @ResponseBody annotation.
//  Run the application. If all works fine, then you can go ahead.

  ToDoService service;

  public ToDoController(ToDoService service) {
    this.service = service;
  }

  @GetMapping(value={"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", ToDoService.getToDoList());
    return "todolist";
  }
}

