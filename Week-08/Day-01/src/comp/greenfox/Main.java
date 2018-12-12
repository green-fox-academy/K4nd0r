package comp.greenfox;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static String fizzBuzz(int number) {
        if (number % 5 == 0 && number % 3 ==0) {
            return "fizzbuzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0){
            return "buzz";
        } else {
            return Integer.toString(number);
        }
    }
}
