package comp.greenfox;

public class Bunny1 {
  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    System.out.println(FloppyEars(5));
  }
  public static int FloppyEars(int n) {
    if(n == 0){
      return 0;
    } else {
      return 2 + FloppyEars(n-1);
    }
  }
}
