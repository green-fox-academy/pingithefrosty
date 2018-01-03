import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    String str = "someString";
    char[] charArray = str.toCharArray();
    List<String> backToString = Stream.of(charArray).map(String::valueOf).collect(Collectors.toList());
    System.out.println(backToString);
  }
}
