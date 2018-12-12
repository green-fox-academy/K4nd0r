package comp.greenfox;

import org.junit.Test;

import static comp.greenfox.Main.fizzBuzz;
import static org.junit.Assert.*;

public class MainTest {
  @Test
  public void test1() {
    assertEquals("fizz", fizzBuzz(3));
  }
  @Test
  public void test2() {
    assertEquals("fizz", fizzBuzz(48));
  }
  @Test
  public void test3() {
    assertEquals("buzz", fizzBuzz(55));
  }
  @Test
  public void test4() {
    assertEquals("fizzbuzz", fizzBuzz(60));
  }

  @Test
  public  void test5() {
    assertEquals("fizz", fizzBuzz(6));
  }



}
