package comp.greenfox;

public class Martix {
    public static void main(String[] args) {

        int asd[][] = new int[4][4];




        for (int i = 0; i < asd.length; i++) {
            for (int j = 0; j < asd[i].length; j++) {
                if (i == j) {
                    int l = 1;
                    asd[i][j] = l;
                }
                System.out.print(asd[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output