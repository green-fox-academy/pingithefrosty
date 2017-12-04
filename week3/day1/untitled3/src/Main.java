import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class untitled3 {
  public static void main(String[] args) {
    List<String> words = Arrays.asList(args);
    Map<String, Integer> wordFrequencies = new LinkedHashMap<>();
    if (words != null) {
      for (String word : words) {
        if (word != null) {
          word = word.trim();
          if (!wordFrequencies.containsKey(word)) {
            wordFrequencies.put(word, 0);
          }
          int count = wordFrequencies.get(word);
          wordFrequencies.put(word, ++count);
        }
      }
    }
  }
}