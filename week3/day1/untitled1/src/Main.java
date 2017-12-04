import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("otos.csv");
        try {
            List<String> original = Files.readAllLines(path);
            List<String> numbers = new ArrayList<>();
            for (int i = 0; i < original.size() ; i++) {
                String str = original.get(i);
                for (int k = 11; k < 14; k++) {
                    String result = str.substring(ordinalIndexOf(str, ";", i) + 1, ordinalIndexOf(str, ";", i + 1));
                    numbers.add(result);
                }
                String result = str.substring(str.lastIndexOf(";")+1);
                numbers.add(result);
            }
            System.out.println(numbers);
        } catch (Exception e) {
            System.out.println("Reversing order is not succesful.");
        }
    }

    public static int ordinalIndexOf(String str, String substr, int n) {
        int pos = str.indexOf(substr);
        while (--n > 0 && pos != -1)
            pos = str.indexOf(substr, pos + 1);
        return pos;
    }
}
