package com.company;

import java.util.Scanner;

public class AvgOfInput {
    public static void main(String[] args) {
        System.out.println("PLeas enter 5 number, separated with enter");
        Scanner scannar = new Scanner(System.in);
        int a = scannar.nextInt();
        int b = scannar.nextInt();
        int c = scannar.nextInt();
        int d = scannar.nextInt();
        int e = scannar.nextInt();
        int sum = a+b+c+d+e;
        System.out.println("Sum:"+ sum);
        double Avg = sum/ 5;
        System.out.println("Avg:"+ Avg );

    }
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4
}
