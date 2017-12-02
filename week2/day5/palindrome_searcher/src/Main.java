import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String input = asd.nextLine();
        List<String> parts = new ArrayList<>();
        for (int k = 3; k < input.length() + 1; k++) {
            for (int i = 0; i < input.length() - k + 1; i++) {
                String sub = input.substring(i, i + k);
                if (check(sub)) {
                    parts.add(sub);
                } else continue;
            }
        }
        System.out.println(parts);
    }

    private static boolean check(String sub) {
        ArrayList<String> input = new ArrayList<>();
        String[] parts = sub.split("");
        for (int i = parts.length -1 ; i > -1; i--) {
            input.add(parts[i]);
        }
        String backToString = "";
        for (String s : input) {
            backToString += s;
        }
        if (sub.equalsIgnoreCase(backToString)){
            return true;
        } else return false;
    }
}
