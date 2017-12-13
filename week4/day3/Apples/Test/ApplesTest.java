import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ApplesTest {

  @Test
  public void getApple() throws Exception {
    Apples apples = new Apples();
    assertEquals("apple",apples.getApple());
  }
}