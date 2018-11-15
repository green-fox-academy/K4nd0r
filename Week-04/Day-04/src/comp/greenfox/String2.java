package comp.greenfox;

public class String2 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    System.out.println(changetoY("yxyadsaxyasadydas"));
  }
  public static String changetoY(String input) {
    if ( input.contains("x")) {
      input = input.replaceAll("x", "");
      return changetoY(input);
    } else {
      return input;
    }
  }
}
