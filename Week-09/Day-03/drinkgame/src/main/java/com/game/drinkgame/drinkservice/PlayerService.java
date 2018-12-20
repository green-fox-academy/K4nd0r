package com.game.drinkgame.drinkservice;


import com.game.drinkgame.Reposítory.DrinkRepository;
import org.springframework.stereotype.Service;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Service
public class PlayerService {

  DrinkRepository drinkRepository;

  private String playerName;
  @Id
  @GeneratedValue
  private long playetID;


  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public void removePlayer(long playerID) {
    drinkRepository.deleteById(playerID);
  }

}
