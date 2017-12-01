public class Main {
    public static void main(String[] args) {
        String reversed = correct(".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI");
    }
    public static String correct(String word) {
        for (int i = 0; i < (word.length()); i++) {
            String order = "" + word.charAt(word.length() - 1 - i);
            System.out.print(order);
        }
        return word;
    }
}}