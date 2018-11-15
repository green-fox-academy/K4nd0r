package comp.greenfox;

import java.util.Scanner;

public class NumberAdder {
  // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
  public static void main(String[] args) {
    Scanner scannar = new Scanner(System.in);
    System.out.println("add a number");
    int n = scannar.nextInt();
    System.out.println(adder(n));
  }
  public static int adder(int limit){
    if (limit == 1){
      return 1;
    } else {
      return limit + adder(limit - 1);
    }
  }

}
