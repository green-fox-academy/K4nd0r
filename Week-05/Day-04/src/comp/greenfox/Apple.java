package comp.greenfox;

public class Apple {
  private String message;

  public Apple(String message) {
    this.message = "apple";
  }

  public String printMessage() {
    System.out.println(message);
    return message;
  }
}
