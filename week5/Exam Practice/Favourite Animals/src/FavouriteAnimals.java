import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FavouriteAnimals {
  public static void main(String[] args) {

    String filePath = "favourites.txt";
    List<String> content;

    try {
      if (args[0].length() > 0) {

        content = readFile(filePath);

        content.add(args[0]);
        writeFile(content, filePath);
      }
    } catch (Exception e) {

      content = readFile(filePath);

      System.out.print("```java FavouriteAnimals");
      for (String line : content) {
        System.out.print(" [" + line + "]");
      }
      System.out.print("```");
    }
  }

  public static List readFile(String fileLocation) {
    Path filePath = Paths.get(fileLocation);
    List<String> contentLines = new ArrayList<>();

    try {
      contentLines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("File reading error");
    }
    return contentLines;
  }

  public static void writeFile(List content, String fileLocation) {
    Path filePath = Paths.get(fileLocation);

    try {
      Files.write(filePath, content);
    } catch (IOException e) {
      System.out.println("File writing error");
    }
  }
}
    // The program's aim is to collect your favourite animals and store them in a text file.
    // There is a given text file called '''favourites.txt''', it will contain the animals
    // If ran from the command line without arguments
    // It should print out the usage:
    // ```java FavouriteAnimals [animal] [animal]```
    // You can add as many command line arguments as many favourite you have.
    // One animal should be stored only at once
    // Each animal should be written in separate lines
    // The program should only save animals, no need to print them