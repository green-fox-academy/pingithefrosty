import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(isAnagram());
    }

    private static Boolean isAnagram() {
        // Getting user input
        Scanner asd = new Scanner(System.in);
        System.out.println("Please enter the first word:");
        String word1 = asd.nextLine();
        System.out.println("Please enter the second word:");
        String word2 = asd.nextLine();
        // Sorting letters and converting back to strings
        char[] letters1 = word1.toCharArray();
        Arrays.sort(letters1);
        String sorted1 = new String(letters1);
        char[] letters2 = word2.toCharArray();
        Arrays.sort(letters2);
        String sorted2 = new String(letters2);
        // Comparing strings
        System.out.println("Are they anagram pairs?");
        boolean result = sorted1.equalsIgnoreCase(sorted2);
        return result;
    }
}
