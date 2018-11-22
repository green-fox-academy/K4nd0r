package comp.greenfox;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {
  Sum sum;

  @Before
  public void beforeEach() {
    sum = new Sum();
  }

  @Test
  public void sumTest() {
    int[] numbers = {1, 2, 3, 4, 5};
    assertEquals(15, sum.sum(numbers));
  }

  @Test
  public void sumTest2() {
    int[] numbers = new int[0];
    assertEquals(0, sum.sum(numbers));
  }

  @Test
  public void sumTest3() {
    int[] numbers = {666};
    assertEquals(666, sum.sum(numbers));
  }

  @Test
  public void sumTest4() {
    int[] numbers =  null;
    assertEquals(0, sum.sum(numbers));
  }
}
