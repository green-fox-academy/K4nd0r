package com.color.coloringaround;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Red")
public class RedColor implements MyColor {
  @Autowired
  Printer print;
  @Override
  public void printColor() {
    print.log("RED");
  }
}
