package com.company;

import java.util.Scanner;

public class BiggerNum {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        System.out.println("Please write 2 number!!!!");
        Scanner scannar = new Scanner(System.in);
        int a = scannar.nextInt();
        int b = scannar.nextInt();
        if ( a > b){
            System.out.println(a);
        }
        else if ( a < b){
            System.out.println(b);
        }
    }
}
