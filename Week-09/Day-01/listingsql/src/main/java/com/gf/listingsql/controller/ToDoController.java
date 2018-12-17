package com.gf.listingsql.controller;

import com.gf.listingsql.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
