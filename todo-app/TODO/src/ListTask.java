import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListTask {
    private ArrayList<Task> listOfTasks = new ArrayList<>();
    private Path path = Paths.get("Storage.txt");
    public void readFile(){
      try {
        List<String> lines = Files.readAllLines(path);
        if (lines.isEmpty()){
          System.out.println("No todos for today! :)");
        } else {
          for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + " - " + lines.get(i));
          }
        }
      } catch (IOException e) {
        System.out.println("Cannot read file");
      }
    }

}

}
 /*   private Task task1 = new Task("Walk the dog");
    Task task2 = new Task("Buy milk");
    Task task3 = new Task("Do homework");
    listOfTasks.add(task1);
    listOfTasks.add(task2);
    listOfTasks.add(task3);
*/