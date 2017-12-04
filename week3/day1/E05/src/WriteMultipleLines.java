import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input the name and path of the file");
    String inputPath = scanner.nextLine();
    System.out.println("Please input the content of the file");
    String inputWord = scanner.nextLine();
    System.out.println("Please input how many lines the file should have");
    int inputNumber = scanner.nextInt();
    Path path = Paths.get(inputPath);
    try {
      List<String> content = new ArrayList();
      for (int i = 0; i < inputNumber; i++) {
        content.add(inputWord);
      }
      Files.write(path, content);
    } catch (Exception e) {
      System.out.println("Unable to write file.");
    }
  }
}
