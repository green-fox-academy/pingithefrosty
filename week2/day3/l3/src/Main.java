import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> far = new ArrayList<>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
        for (int i = 0; i < far.size(); i++){
            System.out.print(far.get(i) + "a ");
        }
    }
}