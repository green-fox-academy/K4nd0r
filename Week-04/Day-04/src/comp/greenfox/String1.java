package comp.greenfox;

public class String1 {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.
    System.out.println(changetoY("yxyadsaxyasadydas"));
  }
  public static String changetoY(String input) {
    if ( input.contains("x")) {
      input = input.replaceAll("x", "y");
      return changetoY(input);
    } else {
      return input;
    }

  }
}
