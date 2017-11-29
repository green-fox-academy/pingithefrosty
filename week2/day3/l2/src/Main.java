import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
        ArrayList<String> order = new ArrayList<String>();
        for (int i = 0; i < girls.size(); i++){
            order.add(boys.get(i) + ", " + girls.get(i));
        }
        order.add(boys.get(5));
        System.out.print(order);
    }
}
