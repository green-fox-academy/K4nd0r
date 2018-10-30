package comp.greenfox;


import java.util.Scanner;

public class Main {
    public static void printNumbers(){
        Scanner scannar = new Scanner(System.in);
        System.out.println("give me a number!");
        int UserInput1 = scannar.nextInt();

        for (int i = 0; i < UserInput1; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        while (true){
            printNumbers();
        }


    }
}
