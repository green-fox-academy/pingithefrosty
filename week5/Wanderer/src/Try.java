import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Try {
  public static void main(String[] args) {
    Path path = Paths.get("maze.txt");
    try {
      List<String> lines = Files.readAllLines(path);
      List<String> layout = new ArrayList<>();
      for (int i = 0; i < lines.size(); i++) {
        layout.add(lines.get(i));
      }
      System.out.println(lines);
    } catch (IOException e) {
      e.printStackTrace();
    }
    }
  }

