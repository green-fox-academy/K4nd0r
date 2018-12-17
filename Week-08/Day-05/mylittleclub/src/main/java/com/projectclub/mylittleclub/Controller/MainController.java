package com.projectclub.mylittleclub.Controller;

import com.projectclub.mylittleclub.Service.Pet;
import com.projectclub.mylittleclub.Service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

  @Autowired
  PetService petService;

  @GetMapping("/")
  public String index(Model model, @RequestParam(value = "name", required = false) String petName) {
    if (petName == null) {
      return "redirect:/login";
    }
    Pet pet = petService.getPetByName(petName);
    model.addAttribute("pet", pet);
    return "index";
  }

  @GetMapping("/login")
  public String useful(Model model) {
    model.addAttribute("text");
    return "login";
  }

  @PostMapping("/login")
  public String createFox(@ModelAttribute Pet pet, RedirectAttributes redir) {
    PetService.addPet(pet);
    redir.addAttribute("name", Pet.getName());
    return "redirect:/";
  }
}

