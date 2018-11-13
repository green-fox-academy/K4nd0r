package comp.greenfox;

public class RollTheDice {

  public static void main(String[] args) {

    DiceSet diceSet = new DiceSet();

    for( int j = 0; j < 6; j++) {
      while ((diceSet.getCurrent(j)) != 6){
        diceSet.reroll(j);
      }
    }

    for (int i = 0; i < 6; i++) {
      System.out.println(diceSet.getCurrent(i));

    }
  }
}
