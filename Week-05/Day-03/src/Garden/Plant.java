package Garden;

public class Plant {
  String Color;
  boolean needsWatering;
  double waterAmount;

  Plant(String color, int wateramount) {
    this.Color = color;
    this.waterAmount = wateramount;
  }
  public void addWater(int water) {
    waterAmount += water;
  }
}
