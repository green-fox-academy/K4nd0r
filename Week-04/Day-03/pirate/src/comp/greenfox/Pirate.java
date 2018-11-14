package comp.greenfox;

import java.util.List;

public class Pirate {
  List<Pirate> piratesAll;
  int intoxicates;
  String name;
  boolean alive = true;
  boolean awake = true;
  boolean parrot = false;

  Pirate() {
    int a = (int) (Math.random() * 100);
    intoxicates = (int) (Math.random() * 5);
    if (a < 20) {
      this.awake = true;
    } else if (a < 50) {
      awake = false;
    }
  }

  void drinkSomeRum() {
    if (this.alive) {
      intoxicates++;
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }
  }

  void howItGoingMate() {
    if (this.alive) {
      if (intoxicates < 4) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println(this.name + " sleeping!");
        this.awake = false;
      }
    } else {
      System.out.println(this.name + " is Dead!");
    }
  }

  void die() {
    this.alive = false;
  }

  void brawl(Pirate pirate) {
    int decider = (int) (Math.random() * 100);
    if (decider < 33) {
      this.alive = false;
    } else if (66 < decider) {
      pirate.alive = false;
    } else {
      this.alive = false;
      pirate.alive = false;
    }
  }
  void addParrot() {
    this.parrot = true;
  }
}
