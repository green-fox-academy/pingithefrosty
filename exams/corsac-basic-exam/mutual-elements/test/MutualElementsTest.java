import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class MutualElementsTest {
  MutualElements filterMutualElements = new MutualElements();

  @Test
  public void filterMutualElements() throws Exception {
    List<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4));
    List<Integer> b = new ArrayList<>(Arrays.asList(3, 4, 4, 5, 6));
    List<Integer> expectedResult = new ArrayList<>(Arrays.asList(3, 4));
    assertEquals(expectedResult, MutualElements.filterMutualElements(a, b));
  }

  @Test
  public void filterMutualElements2() throws Exception {
    List<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4));
    List<Integer> b = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9));
    List<Integer> expectedResult = new ArrayList<>(Arrays.asList());
    assertEquals(expectedResult, MutualElements.filterMutualElements(a, b));
  }

  @Test
  public void filterMutualElements3() throws Exception {
    List<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 4));
    List<Integer> b = new ArrayList<>(Arrays.asList(1, 2, 3));
    List<Integer> expectedResult = new ArrayList<>(Arrays.asList(1));
    assertEquals(expectedResult, MutualElements.filterMutualElements(a, b));
  }
}
