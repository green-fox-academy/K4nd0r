package com.rest.rest.controller;

import com.rest.rest.model.Doubling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class MainController {

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
}
