package com.projectclub.mylittleclub.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/login")
  public String useful(Model model) {
    model.addAttribute("text");
    return "login";
  }
}

