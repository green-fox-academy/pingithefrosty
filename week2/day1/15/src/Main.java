import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        System.out.println("Type in a distance in kilometre:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println("This distance is: " + userInput*0.621371 + " Miles");
    }
}