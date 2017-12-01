import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        Scanner asd = new Scanner(System.in);
        String userinput = asd.nextLine();
        String[] parts = userinput.split(" ");
        for (int i = 0; i < parts.length; i++) {
            input.add(parts[i]);
        }
        System.out.println("Original list: " + input);
        Set<String> output = new HashSet<>(input);
        System.out.println("Unique list: " + output.toString());
    }
}
