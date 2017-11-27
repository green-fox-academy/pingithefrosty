import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Write a program that reads a number form the standard input,
// Than prints "Odd" if the number is odd, or "Even" it it is even.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number:");
        int userinput = scanner.nextInt();
        if (userinput%2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
