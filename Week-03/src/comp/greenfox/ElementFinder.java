package comp.greenfox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementFinder {
    public static String containsSeven(List<Integer> list){
        String its;
         if (list.contains(2)){
             its = "Hoorray";
         }else {
             its = "Nooooooooo";
         }
         return its;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

    }
}
