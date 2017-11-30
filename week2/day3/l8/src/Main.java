import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please type in the expression separated by a space (for example: + 4 4): ");
        Scanner asd = new Scanner(System.in);
        String input = asd.nextLine();
        String[] parts = input.split(" ");
        if (parts.length == 3){
            String operation = parts[0];
            String op1 = parts[1];
            String op2 = parts[2];
            int operand1 = Integer.parseInt(op1);
            int operand2 = Integer.parseInt(op2);
            if (operation.equals("+")) {
                int result = operand1 + operand2;
                System.out.println(result);
            } else if (operation.equals("-")) {
                int result = operand1 - operand2;
                System.out.println(result);
            } else if (operation.equals("*")) {
                int result = operand1 * operand2;
                System.out.println(result);
            } else if (operation.equals("/")) {
                int result = operand1 / operand2;
                System.out.println(result);
            } else if (operation.equals("%")) {
                int result = operand1 % operand2;
                System.out.println(result);
            } else {
                System.out.println("Please enter data in a valid format");
            }
        }
    }
}