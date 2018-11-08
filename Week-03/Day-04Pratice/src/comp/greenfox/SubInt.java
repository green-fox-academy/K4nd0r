package comp.greenfox;

import javax.sound.midi.Soundbank;
import java.util.stream.IntStream;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list
        int a = 0;
        int[] b = { 1,11,34,52,61};
        boolean contains = IntStream.of(b).anyMatch(x -> x == a);
        if ( contains == true){
            for ( int i = 0; i <b.length; i ++)
            System.out.println(b[i]);
        } else{
            System.out.println("empty list");
        }

        //  Example:
//        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
//        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }
}