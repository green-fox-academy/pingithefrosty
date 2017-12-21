import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class UniqueCharsTest {
  UniqueChars uniqueChars = new UniqueChars();

  @Test
  public void uniqueChars() throws Exception {
    String string1 = "aabcddd";
    List<String> list = Arrays.asList("b", "c");
    assertEquals(list, uniqueChars.uniqueChars(string1));
  }

  @Test
  public void uniqueChars2() throws Exception {
    String string1 = "aaaaaaaaaaaaaaab";
    List<String> list = Arrays.asList("b");
    assertEquals(list, uniqueChars.uniqueChars(string1));
  }

  @Test
  public void uniqueChars3() throws Exception {
    String string1 = "abcd";
    List<String> list = Arrays.asList("a", "b", "c", "d");
    assertEquals(list, uniqueChars.uniqueChars(string1));
  }
}
