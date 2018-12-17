package com.greenfox.todo.service;

import com.greenfox.todo.model.ToDo;
import com.greenfox.todo.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

  static ToDoRepository todoRepository;

  public ToDoService(ToDoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }
  public void addToDo( ToDo todo) {
    if (todo != null) {
      todoRepository.save(todo);
    }
  }
  public static List<ToDo> getToDoList() {
    List<ToDo> toDoList = new ArrayList<>();
    todoRepository.findAll().forEach(toDoList::add);
    return toDoList;

  }
}
