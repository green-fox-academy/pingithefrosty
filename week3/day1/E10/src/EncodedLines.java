import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
  public static void main(String[] args) {
    Path path = Paths.get("encoded-lines.txt");
    try {
      List<String> original = Files.readAllLines(path);
      List<String> reversed = new ArrayList<>();
      for (int i = 0; i < original.size() ; i++) {
        String currentRow = original.get(i);
        for (int k = 0; k < original.get(i).length(); k++) {
          System.out.print((char)( Character.valueOf(currentRow.charAt(k))-1)) ;
        }
        System.out.println("");
      }
      System.out.println(reversed);
    } catch (Exception e) {
      System.out.println("Reversing order is not succesful.");
    }
  }
}