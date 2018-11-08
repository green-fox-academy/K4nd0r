package comp.greenfox;

import java.util.Scanner;

public class GueesMyNumber {
    public static void main(String[] args) {


        int myNumber = (int)(Math.random() * 100);
        System.out.println("guess a number between 0-100");
        int lives = 5;


        for (int i =0 ; i <= 5; i++){
            Scanner scanner = new Scanner(System.in);
            int userGuess = scanner.nextInt();
            if (lives == 0){
                System.out.println("u lost");

            }
            else if (userGuess < myNumber) {
                lives = lives - 1;
                System.out.println("The stored number is higher! U have " + lives + " lives left.");
                System.out.println("Guess again!: ");



            } else if (userGuess > myNumber) {
                lives = lives - 1;
                System.out.println("The stored number is lower! U have " + lives + " lives left.");
                System.out.println("Guess again!: ");



            } else if (userGuess == myNumber) {
                System.out.println("YES");

            }

        }



}
}
