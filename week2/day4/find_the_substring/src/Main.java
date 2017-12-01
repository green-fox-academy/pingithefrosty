import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        int index = 0;
        String string1 = asd.nextLine();
        String string2 = asd.nextLine();
        input.add(string1);
        input.add(string2);
        if (string1.contains(string2)){
            index = string1.indexOf(string2);
            System.out.println(index);
        } else {
            index = -1;
            System.out.println(index);
        }
    }
}