import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8
        int theNumber = 8;
        System.out.println("Type a number: ");
        Scanner asd = new Scanner(System.in);
        int input = asd.nextInt();
        while (input != theNumber){
            if (input < theNumber){
                System.out.println("The stored number is higher");
            } else {
                System.out.println("The stored number is lower");
            }
            System.out.println("Type a number: ");
            input = asd.nextInt();
            }
        System.out.println("You found the number: 8");
        }
    }
