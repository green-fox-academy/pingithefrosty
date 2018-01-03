import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    String string = "asklkLKkdaKpSSsdopq";
    String[] arrayString = string.split("");
    Map<String, Long> frequency = Stream.of(arrayString)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(frequency);
  }
}
