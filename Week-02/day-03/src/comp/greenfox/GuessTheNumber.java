package comp.greenfox;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int myNumber = 8;
        System.out.println("guess a number between 0-100");
        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();



        if (userGuess < myNumber) {
            System.out.println("The stored number is higher!");
            System.out.println("Guess again!: ");



        } else if (userGuess > myNumber) {
            System.out.println("the stored number is lower!");
            System.out.println("Guess again!: ");


        } else if (userGuess == myNumber) {
            System.out.println("YES");
        }


}

}



// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8
