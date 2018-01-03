import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    OptionalDouble averageOddNumbers = numbers.stream().filter(n -> n % 2 != 0).mapToInt(n -> n).average();
    System.out.println(averageOddNumbers);
  }
}
