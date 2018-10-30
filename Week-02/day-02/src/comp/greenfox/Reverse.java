package comp.greenfox;

public class Reverse {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        for (int start = 0, end = aj.length - 1; start <= end; start++, end--) {
            int aux = aj[start];
            aj[start] = aj[end];
            aj[end] = aux;
        for (int i = 0; i < aj.length; i++) {
            System.out.print(aj[i] + "\t");
        }
        }
    }
}
// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`
// 3 szor írja ki 