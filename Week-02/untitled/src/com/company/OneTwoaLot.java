package com.company;

import java.util.Scanner;

public class OneTwoaLot {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot
        Scanner scannar = new Scanner(System.in);
        System.out.println("Write a NUMBER!!!");
        int UserInput1 = scannar.nextInt();
        if ( UserInput1 <= 0){
            System.out.println("not enough!!!!");
        }
        else if ( UserInput1 == 1){
            System.out.println("One");
        }
        else if ( UserInput1 == 2) {
            System.out.println("Two");
        }
        else if ( UserInput1 > 2){
            System.out.println(" A lot");
        }


    }
}
