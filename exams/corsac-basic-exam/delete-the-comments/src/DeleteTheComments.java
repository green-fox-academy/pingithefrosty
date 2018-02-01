import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DeleteTheComments {
  public static void main(String[] args) {
    overwriteWithoutSingleLineComments("src2/FileWithComments.java");
  }

  private static void overwriteWithoutSingleLineComments(String filePath) {
    List<String> contentLinesOriginal = readFile(filePath);
    List<String> contentLinesWithoutSingleComments = new ArrayList<>();
    for (int i = 0; i < contentLinesOriginal.size(); i++) {
      if (!contentLinesOriginal.get(i).contains("//")) {
        contentLinesWithoutSingleComments.add(contentLinesOriginal.get(i));
      }
    }
    writeFile(contentLinesWithoutSingleComments, filePath);
  }

  public static List readFile(String fileLocation) {
    Path filePath = Paths.get(fileLocation);
    List<String> contentLines = new ArrayList<>();
    try {
      contentLines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Cannot read file.");
    }
    return contentLines;
  }

  public static void writeFile(List contentLines, String fileLocation) {
    Path filePath = Paths.get(fileLocation);
    try {
      Files.write(filePath, contentLines);
    } catch (IOException e) {
      System.out.println("Cannot write file");
    }
  }
}
