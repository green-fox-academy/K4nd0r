package comp.greenfox;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++)
            if ( i % 15 == 0) {
                System.out.println("fizzBuzz");
            } else if ( i % 5 == 0) {
                System.out.println("buzz");
            } else if ( i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
    }
}
// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.