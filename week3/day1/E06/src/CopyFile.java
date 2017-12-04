import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input the name and path of the source file");
    String inputPath = scanner.nextLine();
    System.out.println("Please input the name and path of the destination file");
    String inputPath2 = scanner.nextLine();
    Path path = Paths.get(inputPath);
    Path path2 = Paths.get(inputPath2);
    try {
      List<String> lines = Files.readAllLines(path);
      Files.write(path2, lines);
      System.out.println("Copy succesful: "+true);
    } catch (Exception e) {
      System.out.println("Copy succesful: "+false);
    }
  }
}