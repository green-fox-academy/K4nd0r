package comp.greenfox;

public class Swap {
    public static void main(String[] args) {
        String[] abc ={"first", "second", "third"};
        String[] temp = {abc[0]};
        abc[0] = abc[2];
        abc[2] = temp[0];

        for(int i = 0; i<abc.length;i++) {
            System.out.print(abc[i] + "\t");
        }
        System.out.println();

    }
}
// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`