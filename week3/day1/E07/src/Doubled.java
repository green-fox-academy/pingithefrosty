import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    Path path = Paths.get("doubled-chars.txt");
    try {
      List<String> lines = Files.readAllLines(path);
      List<String> decrypted = new ArrayList<>();
      for (int i = 0; i < lines.size() ; i++) {
        for (int k = 0; k < lines.get(i).length()-1; k+=2) {
          System.out.print((String.valueOf(lines.get(i).charAt(k))));
        }
        System.out.println("");
      }
      System.out.println(decrypted);
    } catch (Exception e) {
      System.out.println("Decryption not succesful.");
    }
  }
}