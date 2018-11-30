package Pirate;

public class Pirates extends Pirate{
  public static void drinkSomeRum() {
    howDrunk += 1;
  }
  public static void howItGoingMate() {
    if(!isAlive) {
      System.out.println("I'm dead.");
    } else {
      if (howDrunk <= 4) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      }
    }
  }
}
