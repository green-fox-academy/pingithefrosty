import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of girls coming:");
        int input1 = scanner.nextInt();
        System.out.println("Enter the number of boys coming:");
        int input2 = scanner.nextInt();
        if (input1 == input2 && input1 + input2 > 20){
            System.out.println("Party is excellent!");
        } else if (input1 != input2 && input1 + input2 > 20){
            System.out.println("Quite cool party!");
        } else if (input1+input2 < 20) {
            System.out.println("Average party...");
        } else if (input1 == 0) {
            System.out.println("Sasusage party");
        }
    }
}
