package com.game.drinkgame.controller;

import com.game.drinkgame.drinkservice.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/players")
public class PlayerController {
  private PlayerService playerService;

  @Autowired
  public PlayerController(PlayerService playerService) {
    this.playerService = playerService;
  }

  @GetMapping("/addplayers")
  public String addPlayer(Model model) {
    model.addAttribute(new PlayerService());
    return "addplayers";
  }

//  @PostMapping("/addplayers")
//  public String addPlayer(@ModelAttribute ) {
//
//  }
}
