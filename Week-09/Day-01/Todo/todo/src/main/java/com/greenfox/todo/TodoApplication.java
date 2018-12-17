package com.greenfox.todo;

import com.greenfox.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {
  @Autowired
  ToDoService service;

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }

}

