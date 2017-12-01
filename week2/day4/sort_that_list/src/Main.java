import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        String userinput = asd.nextLine();
        Boolean userinput2 = asd.nextBoolean();
        String[] parts = userinput.split(" ");
        for (int i = 0; i < parts.length; i++) {
            input.add(parts[i]);
        }
        System.out.println();
        if (userinput2 == true) {
            Collections.sort(input, Collections.reverseOrder());
            System.out.println(input);
        } else {
            Collections.sort(input);
            System.out.println(input);
        }
    }
}

/*
Create a function that takes a list of numbers as parameter
Returns a list where the elements are sorted in ascending numerical order
Make a second boolean parameter, if it's true sort that list descending
 */
