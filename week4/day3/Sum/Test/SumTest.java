import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class SumTest {
  Sum sum = new Sum();

  @Test
  public void sum() throws Exception {
    ArrayList<Integer> newArrayList = new ArrayList<>(Arrays.asList(1,2,3));
    assertEquals(6,sum.sum(newArrayList));
  }

  @Test
  public void sumEmpty() throws Exception {
    ArrayList<Integer> newArrayList = new ArrayList<>();
    assertEquals(0,sum.sum(newArrayList));
  }

  @Test
  public void sumOne() throws Exception {
    ArrayList<Integer> newArrayList = new ArrayList<>(Arrays.asList(1));
    assertEquals(1,sum.sum(newArrayList));
  }
}