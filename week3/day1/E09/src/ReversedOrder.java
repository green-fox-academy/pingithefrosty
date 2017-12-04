import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    Path path = Paths.get("reversed-order.txt");
    try {
      List<String> original = Files.readAllLines(path);
      List<String> reversed = new ArrayList<>();
      for (int i = original.size()-1; i > -1 ; i--) {
        for (int k = 0; k < original.get(i).length(); k++) {
          System.out.print((String.valueOf(original.get(i).charAt(k))));
        }
        System.out.println("");
      }
      System.out.println(reversed);
    } catch (Exception e) {
      System.out.println("Reversing order is not succesful.");
    }
  }
}