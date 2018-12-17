package com.projectclub.mylittleclub.Service;

import java.util.ArrayList;
import java.util.List;

public class Pet {
  private String name;
  private String food;
  private String drink;
  private List<String> tricks;

  public Pet() {
    tricks = new ArrayList<>();
  }

  public Pet( String name, String food, String drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
  }
  public String getName() {
    return name;
  }
  public String getFood() {
    return food;
  }
  public String getDrink() {
    return drink;
  }

}
