import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {
  Fibonacci fibonacci = new Fibonacci();
  int testNumber = 5;

  @Test
  public void fibonacci() throws Exception {
    HashMap<Character, Integer> testMap = new HashMap<Character, Integer>() {{
      put('a', 2);
      put('b', 1);
      put('c', 1);
      put('d', 3);
    }};
    assertEquals(testMap, countLetters.countLetters(string1));
  }
}