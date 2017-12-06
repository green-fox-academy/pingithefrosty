import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        List<Integer> h = new ArrayList<>();
        int[] input = new int[]{4, 7, 5, 3, 2, 8, 6, 9};
        int shoot = 7;
        // game loop
        int times = 0;
        while (times < 8) {
            for (int i = 0; i < 8; i++) {
                int mountainH = input[i]; // represents the height of one mountain.
                h.add(mountainH);
            }
            Collections.reverse(h);
            System.out.println("h: "+h);
            System.out.println("h.get(shoot): " + h.get(shoot));
            h.clear();
            shoot = shoot - 1;
            times = times + 1;
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            // The index of the mountain to fire on.
        }
    }
}