package comp.greenfox;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
String message = "apple";
  Apple messageUtil = new Apple(message);

  @Test
  public void testPrintMessage() {
    assertEquals(message, messageUtil.printMessage());
  }

  @Test
  public void getApple() {

  }
}
