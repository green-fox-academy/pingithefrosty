import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(createPalindrome());

    }

    private static String createPalindrome() {
        Scanner asd = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = asd.nextLine();
        // Sorting letters and converting back to strings
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        
        String sorted1 = new String(letters);
        return null;
    }
}
