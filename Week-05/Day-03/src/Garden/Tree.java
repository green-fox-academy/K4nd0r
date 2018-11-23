package Garden;

public class Tree extends Plant{
  Tree(String color, int waterAmount) {
    super(color, waterAmount);
    needsWatering = (waterAmount < 10);
  }
  public void addWater(int water) {
    waterAmount += .4 * water;
    needsWatering = (waterAmount < 5);
  }
}
