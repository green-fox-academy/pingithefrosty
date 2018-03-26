import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> listOfStrings = Arrays.asList("ab", "cde", "fg");
    String result = stringJoiner(listOfStrings, " ");
    System.out.println("Before: " + listOfStrings);
    System.out.println("After: " + result);
  }

  private static String stringJoiner(List<String> listOfStrings, String letter) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < listOfStrings.size(); i++) {
      if (i + 1 != listOfStrings.size()) {
        result.append(listOfStrings.get(i)).append(letter);
      } else {
        result.append(listOfStrings.get(i));
      }
    }
    return result.toString();
  }

}
