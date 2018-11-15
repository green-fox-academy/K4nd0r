package comp.greenfox;

public class Refractorio {
  public static void main(String[] args) {


    System.out.println(refractorio(4));

  }
  public static int refractorio(int number) {
    if ( number == 0) {
      return 1;
    }
    return number * refractorio(number-1);
  }
}
