package com.greenfox.todo.service;

import com.greenfox.todo.model.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

  static TodoRepository todoRepository;

  public ToDoService(TodoRepository todoRepository) {
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
