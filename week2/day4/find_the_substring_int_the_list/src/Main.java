import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(scanner());
    }
    private static String scanner() {
        Scanner asd = new Scanner(System.in);
        String inputstring = asd.nextLine();
        ArrayList<String> array = new ArrayList<>();
        String inputarray = asd.nextLine();
        String[] parts = inputarray.split(" ");
        for (int i = 0; i < parts.length; i++) {
            array.add(parts[i]);
        }
        String result = "-1";
        for (int j = 0; j < array.size(); j++) {
            if (array.get(j).contains(inputstring)) {
                result = String.valueOf(j);
            }
        }
        return result;
    }
}