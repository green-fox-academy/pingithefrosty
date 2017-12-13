import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnagramTest {
  Anagram anagram = new Anagram();
  String string1 = "listen";
  String string2 = "silent";

  @Test
  public void isAnagram() throws Exception {
    assertEquals(true,anagram.isAnagram(string1, string2));
  }
}