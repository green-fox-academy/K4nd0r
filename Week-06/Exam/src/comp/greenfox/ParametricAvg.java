package comp.greenfox;

import java.util.Scanner;

public class ParametricAvg {
  public static void main(String[] args) {
    System.out.println("add a number");
    Scanner scannar = new Scanner(System.in);
    int n = scannar.nextInt();
    System.out.println("Add " + n + " number");
    AvgMethod(SumMethod(n), n);
  }
  public static int SumMethod( int n) {
    Scanner scannar = new Scanner(System.in);
    int sum = 0;
    for ( int i =1; i <= n; i++){
      int newnumber = scannar.nextInt();
      sum = sum + newnumber;
    }
    return sum;
  }
  public static void AvgMethod(int sum, int n){
    double avg = sum / n ;
    System.out.println("sum: " + sum);
    System.out.println("avg: " + avg);
  }
}
