package comp.greenfox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Farm {
  private static int farmcapacity = 20;
  private int freePlaces = 20;
  Map animalslist = new HashMap();

  void breed(){
    if (freePlaces > 0){
      animalslist.put((farmcapacity - freePlaces), "cow");
      freePlaces--;
    }


  }
  void slaughter(){

  }
}
