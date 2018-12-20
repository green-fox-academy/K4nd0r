package com.game.drinkgame.controller;


import com.game.drinkgame.drinkservice.DrinkService;
import com.game.drinkgame.drinkservice.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class DrinkController {

  DrinkService drinkService;

  @Autowired
  public DrinkController( DrinkService drinkService) {
    this.drinkService = drinkService;
  }



}
