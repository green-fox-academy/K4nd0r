package comp.greenfox;

public class Station {
  int gasAmount;

  public void refill(Car car){
    gasAmount = (car.carGasAmount - car.capacity);
    car.carGasAmount = gasAmount;
  }

}
