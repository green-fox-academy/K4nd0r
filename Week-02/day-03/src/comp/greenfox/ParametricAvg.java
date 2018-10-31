package comp.greenfox;

import java.util.Scanner;

public class ParametricAvg {
    public static void main(String[] args) {
        System.out.println("add a number");
        Scanner scannar = new Scanner(System.in);
        int n = scannar.nextInt();
        int sum = 0;



        for ( int i =1; i <= n; i++){
            int a = scannar.nextInt();
            sum = sum+a;


        }
        double avg = sum / n ;
        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
    }
}
