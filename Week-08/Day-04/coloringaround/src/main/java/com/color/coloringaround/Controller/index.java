package com.color.coloringaround.Controller;

import com.color.coloringaround.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class index {
  @Autowired
  UtilityService utilService;

  @GetMapping("/useful")
  public String useful(Model model) {
    model.addAttribute("text");
    return "useful";
  }
  @GetMapping("/useful/color")
  public String color(Model model) {
    model.addAttribute("color", utilService.randomColor());
    return "color";
  }
  @GetMapping("/useful/email")
  public String validateEmail(Model model,
                              @RequestParam(value = "email",required = false, defaultValue = "example@example.com")
                                  String email) {
    if (utilService.validateEmail(email)) {
      model.addAttribute("color", "green");
      model.addAttribute("text", email + " is a valid email address.");
    } else {
      model.addAttribute("color", "red");
      model.addAttribute("text", email + " is not a valid email address.");
    }
    return "validemail";
  }
}
