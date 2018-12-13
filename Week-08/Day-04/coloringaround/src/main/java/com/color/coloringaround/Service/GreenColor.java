package com.color.coloringaround.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Green")
public class GreenColor implements MyColor {
  final
  Printer print;

  @Autowired
  public GreenColor(Printer print) {
    this.print = print;
  }

  @Override
  public void printColor() {
    print.log("Green");
  }
}
