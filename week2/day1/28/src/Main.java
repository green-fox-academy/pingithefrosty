import java.util.Scanner;

public class Main {
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
// *
// **
// ***
// ****
// The triangle should have as many lines as the number was
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        int input = asd.nextInt();
        for (int x = 1; x <= input; x++) {
            for (int i = 1; i >= x; i--) {
                System.out.print(" ");
            }
            System.out.println(" *");
        }
    }
}

