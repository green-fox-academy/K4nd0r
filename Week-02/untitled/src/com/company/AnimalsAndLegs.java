package com.company;

import java.util.Scanner;

public class AnimalsAndLegs {

    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        System.out.println("How many chikens the farmer has?");
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt() *2;
        System.out.println("how many pigs he has?");
        int userInput2 = scanner.nextInt() *4;
        System.out.println("Animals has "+ (userInput1 + userInput2)  + "legs.");

    }
}
