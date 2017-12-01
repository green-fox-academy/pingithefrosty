import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(createPalindrome());
    }

    private static String createPalindrome() {
        Scanner asd = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = asd.nextLine();
        String result = "";
        for (int i = 0; i < word.length() ; i++) {
            result += word.charAt(i);
        }
        for (int j = word.length()-1 ; j > -1 ; j--) {
            result += word.charAt(j);
        }
        return result;
    }
}
