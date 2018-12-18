package com.gf.listingsql.service;

import com.gf.listingsql.model.ToDo;
import com.gf.listingsql.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
  ToDoRepository toDoRepository;

  public ToDoService(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  public void addToDo(ToDo todo) {
    if (todo != null) {
      toDoRepository.save(todo);
    }
  }

  public ToDo getToDoBy(Long id) {
    return toDoRepository.findById(id).orElse(null);
  }

  public List<ToDo> getToDoList() {
    List<ToDo> todoList = new ArrayList<>();
    toDoRepository.findAll().forEach(todoList::add);
    return todoList;
  }

  public void deleteToDoById(Long id) {
    toDoRepository.deleteById(id);
  }
}
