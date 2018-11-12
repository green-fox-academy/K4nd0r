package comp.greenfox;


import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    Scanner scannar = new Scanner(System.in);
    int userInput = scannar.nextInt();
    try {
      int a = 10 / userInput;
      System.out.println(a);
    }catch (Exception e) {
      System.out.println("fail");
    }
  }
}
