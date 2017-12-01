import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        System.out.println("Welcome to the guessing game. Enter the minimum and the maximum " +
                "range of the number the program chooses and then enter how many lives do you have:");
        int min = asd.nextInt();
        int max = asd.nextInt();
        int maxlife = asd.nextInt();
        Random rand = new Random();
        int theNumber = rand.nextInt(max)+min;
        System.out.println("I have the number between " + min + " - " + max + ". You have " + maxlife +
                " lives.");
        System.out.println("Enter a guess:");
        for (int i = maxlife; i > 0 ; i--) {
            int guess = asd.nextInt();
            if (guess == theNumber) {
                System.out.println("Coungratulations you won!");
            } else if (guess > theNumber) {
                System.out.println("Too high. You have " + (i - 1) + " lives left.");
            } else if (guess < theNumber){
                System.out.println("Too low. You have " + (i - 1) + " lives left.");
            } continue;
        }
        System.out.println("You have no lives left. You lost.");
    }
}
