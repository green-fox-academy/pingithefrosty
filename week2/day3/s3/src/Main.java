public class Main {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        System.out.println(quote.substring(0,10)+"\'"+quote.substring(11,21)+"always takes longer than"+quote.substring(20,82));
    }
}