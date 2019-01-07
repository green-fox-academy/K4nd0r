package com.rest.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Doubling {

  private Integer recieved;
  private Integer result;

  public Doubling() {

  }

  public Integer getRecieved() {
    return recieved;
  }

  public void setRecieved(Integer recieved) {
    this.recieved = recieved;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }


  public void doDoubling() {
    result = recieved * 2;
  }
}
