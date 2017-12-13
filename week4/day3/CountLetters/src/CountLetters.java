import java.util.Arrays;
import java.util.HashMap;

public class CountLetters {
  public HashMap<Character, Integer> countLetters (String inputString) {
    HashMap<Character, Integer> dictionary = new HashMap<>();
    char[] letters = inputString.toCharArray();
    Arrays.sort(letters);
    for (int i = 0; i < letters.length; i++) {
      if (!dictionary.containsKey(inputString.charAt(i))) {
        dictionary.put(inputString.charAt(i),1);
      } else {
        dictionary.put(inputString.charAt(i),dictionary.get(inputString.charAt(i)) + 1);
      }
    }
    return dictionary;
  }
}
