import java.util.ArrayList;
import java.util.List;

public class UniqueChars {
  public static void main(String[] args) {
    // Create a function called `uniqueCharacters` that takes a string as parameter
    // and returns a list with the unique letters of the given string
    // Create basic unit tests for it with at least 3 different test cases
    System.out.println(uniqueChars("anagram"));
    // Should print out:
    // ["n", "g", "r", "m"]
  }

  public static List<String> uniqueChars(String string) {
    List<String> outputCharacters = new ArrayList<>();
    ArrayList<Character> characterRegister = new ArrayList<>();

    for (int i = 0; i < string.length(); i++) {
      if ((string.lastIndexOf(string.charAt(i)) != i) || (characterRegister.contains(string.charAt(i)))) {
        characterRegister.add(string.charAt(i));
      } else {
        outputCharacters.add(String.valueOf(string.charAt(i)));
      }
    }
    return outputCharacters;
  }
}