import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    List<Integer> moreThanTwentyWhenSquared = numbers.stream().filter(n -> n * n > 20).collect(Collectors.toList());
    System.out.println(moreThanTwentyWhenSquared);
  }
}
