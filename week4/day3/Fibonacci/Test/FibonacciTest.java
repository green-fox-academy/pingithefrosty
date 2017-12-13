import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {
  Fibonacci fibonacci = new Fibonacci();

  @Test
  public void fibonacciFive() throws Exception {
    int five = 5;
    assertEquals(5,fibonacci.fibonacci(five));
  }

  @Test
  public void fibonacciTen() throws Exception {
    int ten = 10;
    assertEquals(55,fibonacci.fibonacci(ten));
  }

}