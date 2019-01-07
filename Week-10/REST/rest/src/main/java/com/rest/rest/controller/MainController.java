package com.rest.rest.controller;

import com.rest.rest.model.DoUntil;
import com.rest.rest.model.Doubling;
import com.rest.rest.model.Entry;
import com.rest.rest.model.Until;
import com.rest.rest.service.EntryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;

@RestController
public class MainController {

  private EntryService entryService;

  @GetMapping(value = "/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null){
      Doubling doubling = new Doubling();
      doubling.setRecieved(input);
      doubling.doDoubling();
      return doubling;
    } else{
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Provide an input!");
      return error;
    }
  }

  @GetMapping("/greeter")
  public Object greeting(@RequestParam(value = "name", required = false) String name,
                         @RequestParam(value = "title", required = false) String title) {
    if (name == null && title == null) {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Provide an input!");
      return error;
    } else if ( name != null && title == null) {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Provide a title!");
      return error;
    } else if ( name == null && title != null) {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Provide a name!");
      return error;
    } else {
      HashMap<String, String> greeter = new HashMap<>();
      greeter.put("welcome_message", String.format("Oh, hi there %s, my dear %s!", name, title));
      return greeter;
    }
  }

  @GetMapping("/appenda")
  public Object appendaRoot() {
    return new ResponseEntity(HttpStatus.NOT_FOUND);
  }

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable String appendable) {
    HashMap<String, String> appendWithA = new HashMap<>();
    appendWithA.put("appended", appendable + "a");
    return appendWithA;
  }

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable String action, @RequestBody Until until) {
    if (action.equals("sum")) {
      DoUntil sumUntil = new DoUntil();
      sumUntil.sum(until);
      Entry entry = new Entry("/dountil", String.format("/%s", action));
      entryService.addEntry(entry);
      return sumUntil;
    } else if (action.equals("factor")) {
      DoUntil factorUntil = new DoUntil();
      factorUntil.factorial(until);
      Entry entry = new Entry("/dountil", String.format("/%s", action));
      entryService.addEntry(entry);
      return factorUntil;
    } else {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Please provide a number!");
      return error;
    }
  }
}
