import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
