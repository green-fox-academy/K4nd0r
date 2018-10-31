package comp.greenfox;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        System.out.println("Please enter a number!");
        Scanner scannar = new Scanner(System.in);
        int number = scannar.nextInt();

        for ( int i = 0; i<number; i++){
            System.out.print("%");
        }
        System.out.println();
        for ( int i = 0;i<number; i++){
            System.out.print("%");
            for ( int k=0; k<number-2;k++){
                System.out.print(" ");
            }
            System.out.print("%");
            System.out.println(" ");
        }
        for (int i =0; i<number; i++){
            System.out.print("%");
        }
    }
}
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was
