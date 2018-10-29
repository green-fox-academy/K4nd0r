package com.company;

public class SecsinaDay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int allSecunds = 86400;
        int LeftSeconds = allSecunds - ( 60 - currentSeconds ) - ( 60 - currentMinutes - 1) * 60 - ( 24 - currentHours - 1 ) * 60 * 60;
        System.out.println(LeftSeconds);
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        // rossz a képlet



    }
}

