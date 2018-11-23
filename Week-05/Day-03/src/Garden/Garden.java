package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> plants;

  Garden() {
    plants = new ArrayList<>();
  }
  private int howManyPlantsNeedsWater() {
    int quantity = 0;
    for (Plant plant : plants) {
      if (plant.needsWatering) {
        quantity++;
      }
    }
    return quantity;
  }
  public void addPlant(Plant plant){
    plants.add(plant);
  }
  public void water(int water) {
    System.out.println("Watering with " + water);
    int waterPerPlant = water / howManyPlantsNeedsWater();
    for (Plant plant : plants) {
      if (plant.needsWatering) {
        plant.addWater(waterPerPlant);
      }
    }
  }
  public void info() {
    for (Plant plant : plants) {
      if (plant.needsWatering) {
        System.out.println("The " + plant.Color + " " + plant.getClass().getSimpleName() + " needs water (" + plant.waterAmount + ")");
      } else {
        System.out.println(
            "The " + plant.Color + " " + plant.getClass().getSimpleName() + " doesn't need water (" + plant.waterAmount + ")"
        );
      }
    }
  }
}
