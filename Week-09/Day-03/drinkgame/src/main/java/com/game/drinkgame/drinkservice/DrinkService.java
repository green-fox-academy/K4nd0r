package com.game.drinkgame.drinkservice;

import com.game.drinkgame.Reposítory.DrinkRepository;
import org.springframework.stereotype.Service;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Service
public class DrinkService {
  DrinkRepository drinkRepository;


  @Id
  @GeneratedValue
  private long textID;
  String text;

}
