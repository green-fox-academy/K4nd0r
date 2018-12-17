package com.greenfox.todo;

import com.greenfox.todo.model.ToDo;
import com.greenfox.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication  implements CommandLineRunner {

  private ToDoService service;

  @Autowired
  public TodoApplication(ToDoService service) {
    this.service = service;
  }
  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    service.addToDo(new ToDo("fck off"));
    service.addToDo(new ToDo("asd1"));
    service.addToDo(new ToDo("fck off twice"));
  }
}

