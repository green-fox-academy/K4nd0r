package comp.greenfox;

import java.util.ArrayList;
import java.util.List;

public class PirateNames {
  List<String> pirateNames = new ArrayList<>();

  PirateNames(String name) {
    pirateNames.add(name);
  }
  List<String> pirate() {
    pirateNames.add("pirate01");
    pirateNames.add("pirate02");
    pirateNames.add("pirate03");
    pirateNames.add("pirate04");
    pirateNames.add("pirate05");
    pirateNames.add("pirate06");
    pirateNames.add("pirate07");
    pirateNames.add("pirate08");
    pirateNames.add("pirate09");
    pirateNames.add("pirate10");
    return pirateNames;
  }
}
