import java.util.Arrays;

public class Anagram {
  static Boolean isAnagram(String string1, String string2) {
    char[] letters1 = string1.toCharArray();
    Arrays.sort(letters1);
    String sorted1 = new String(letters1);
    char[] letters2 = string2.toCharArray();
    Arrays.sort(letters2);
    String sorted2 = new String(letters2);
    return sorted1.equalsIgnoreCase(sorted2);
  }
}