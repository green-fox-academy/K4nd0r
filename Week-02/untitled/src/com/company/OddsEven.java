package com.company;

import java.util.Scanner;

public class OddsEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,

        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        System.out.println("please enter a number");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if ( userInput % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
}
