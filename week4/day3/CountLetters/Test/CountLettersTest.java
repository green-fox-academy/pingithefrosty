import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.assertEquals;

public class CountLettersTest {
  CountLetters countLetters = new CountLetters();
  String string1 = "aabcddd";

  @Test
  public void countLetters() throws Exception {
    HashMap<Character, Integer> testMap = new HashMap<Character, Integer>() {{
      put('a', 2);
      put('b', 1);
      put('c', 1);
      put('d', 3);
    }};
    assertEquals(testMap, countLetters.countLetters(string1));
  }
}