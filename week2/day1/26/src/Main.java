import java.util.Scanner;
public class Main {
    // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
// first number: 3, second number: 6, should print:
// 3
// 4
// 5
    public static void main(String[] args) {
        System.out.println("Write two numbers:");
        Scanner asd = new Scanner(System.in);
        int n1 = asd.nextInt();
        int n2 = asd.nextInt();
        if (n1 >= n2){
            System.out.println("The second number should be bigger");
        } else {
            for (int i = n1; i < n2; i++){
                System.out.println(i);
            }
        }
    }
}
