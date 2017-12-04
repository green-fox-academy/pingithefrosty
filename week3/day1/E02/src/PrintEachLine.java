import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    List<String> lines = null;
    try {
      Path filePath = Paths.get("my-file.txt");
      lines = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Unable to read file: my-file.txt");
    }
    System.out.println(lines);
  }
}