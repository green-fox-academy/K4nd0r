package com.company;

import java.util.Scanner;

public class MiletoKm {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        System.out.println("Mile to Km");
        Scanner scanner = new Scanner(System.in);
        int Userinput1 = scanner.nextInt();
        System.out.println(  Userinput1 * 1.609344 + " Km");
    }
}
