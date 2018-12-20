package com.game.drinkgame.model;

import com.game.drinkgame.Reposítory.DrinkRepository;

import java.util.ArrayList;
import java.util.List;

public class WhoDrinks {
  DrinkRepository drinkRepository;
  List<String> text = new ArrayList<>();

  public long lastId() {
    long id;
    return id = drinkRepository.count();
  }

//  public void readLastLine() {
//    text.clear();
//    //text.add(drinkRepository.findById(lastId()));
//    //valahogy ki kéne szedni mint egy string a megadott szöveget valószínűleg 3 tábla lesz
//
//  }
//
//  public long convertToNumbres() {
//    long ascii = 0;
//    char[] chars = text.toString().toCharArray();
//    for (int i = 0; i < chars.length; i++) {
//      int number = chars;
//      ascii += number;
//    }
//    return ascii;
//  }
//
//  public int idOfTheNextPlayer() {
//
//    return 1;
//  }

  public int getRandomNumber() {
    int maxplayer = (int) lastId();
    int randomid = (int)Math.random()* maxplayer;
    return randomid;
  }
  public void getTheName() {
    drinkRepository.findById(getRandomNumber());
  }
}
