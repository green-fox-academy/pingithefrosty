import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PrintUsage {
  public static void main(String[] args) {


    // usage information if no arghs
   if (args.length == 0) {
      System.out.println(
          "Command Line Todo application\n" +
              "=============================\n" +
              "Command line arguments:\n" +
              "-l   Lists all the tasks\n" +
              "-a   Adds a new task\n" +
              "-r   Removes an task\n" +
              "-c   Completes an task");
    } else if (args.length > 0) {
     if (args[0].equals("-l")){
        readFile();
     } else if (args[0].equals("-a")){

     } else if (args[0].equals("-r")){

     } else if (args[0].equals("-c")){
     }
    }

  }
}
