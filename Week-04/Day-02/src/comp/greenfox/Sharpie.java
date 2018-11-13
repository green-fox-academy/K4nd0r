package comp.greenfox;

public class Sharpie {
  String color;
  float width;
  float inkAmount = 100;

  Sharpie(String color, float width){
    this.color = color;
    this.width = width;
  }
  Sharpie(String color, float width, float inkAmount){
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }


  float use(){
    return inkAmount -=1;
  }

}
