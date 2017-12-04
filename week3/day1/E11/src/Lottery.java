import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Lottery {
  public static void main(String[] args) {
    Path path = Paths.get("otos.csv");
    try {
      List<String> original = Files.readAllLines(path);
      List<Integer> numbersInteger = new ArrayList<>();
      List<String> numbersString = new ArrayList<>();
      for (int i = 0; i < original.size() ; i++) {
        String str = original.get(i);
        for (int k = 11; k < 15; k++) {
          String result = str.substring(ordinalIndexOf(str, ";", k) + 1, ordinalIndexOf(str, ";", k + 1));
          numbersString.add(result);
        }
        String result = str.substring(str.lastIndexOf(";")+1);
        numbersString.add(result);
      }
      for(String s : numbersString) {
        numbersInteger.add(Integer.valueOf(s));
      }

      System.out.println(numbersInteger);



    } catch (Exception e) {
      System.out.println("Converting is not succesful.");
    }
  }

  public static int ordinalIndexOf(String str, String substr, int n) {
    int pos = str.indexOf(substr);
    while (--n > 0 && pos != -1)
      pos = str.indexOf(substr, pos + 1);
    return pos;
  }
}
