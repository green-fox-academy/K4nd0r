package comp.greenfox;


import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.addAll;

public class Letter {
    public static void main(String[] args) {
        List<String> far = asList("bo", "anacond", "koal", "pand", "zebr");
        ArrayList<String> appendA = new ArrayList<>();

        for ( int i = 0; i <= 4; i++ ){
            appendA.add(far.get(i)+"a" );
        }
        System.out.println(appendA);

    }
    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.


}
// The output should be: "boa", "anaconda", "koala", "panda", "zebra"