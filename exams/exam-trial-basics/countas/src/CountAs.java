import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountAs {
  public static void main(String[] args) {
    System.out.println(countA("afile.txt"));
  }

  //Returns the number of letter "a" from a file. It returns 0 if the file cannot be read.
  private static int countA(String fileName) {
    int numberOfAs = 0;
    try {
      Path filePath = Paths.get(fileName);
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        String currentRow = lines.get(i);
        for (int j = 0; j < currentRow.length(); j++) {
          if (currentRow.charAt(j) == 'a') {
            numberOfAs ++;
          } else if (currentRow.charAt(j) == 'A') {
            numberOfAs ++;
          }
        }
      }
      return numberOfAs;
    } catch (Exception e) {
      return 0;
    }
  }
}
