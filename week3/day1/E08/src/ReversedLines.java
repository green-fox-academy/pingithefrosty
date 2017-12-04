import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    Path path = Paths.get("reversed-lines.txt");
  try {
    List<String> original = Files.readAllLines(path);
    List<String> reversed = new ArrayList<>();
      for (int i = 0; i < original.size() ; i++) {
        for (int k = original.get(i).length()-1; k > -1; k--) {
          System.out.print((String.valueOf(original.get(i).charAt(k))));
        }
        System.out.println("");
      }
      System.out.println(reversed);
    } catch (Exception e) {
    System.out.println("Reversing is not succesful.");
    }
  }
}
