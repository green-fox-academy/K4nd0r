package Garden;

public class Flower extends Plant {
  Flower(String color, int waterAmount) {
    super(color, waterAmount);
    needsWatering = (waterAmount < 5);
  }
  public void addWater(int water) {
    waterAmount += .75 * water;
    needsWatering = (waterAmount < 5);
  }
}
