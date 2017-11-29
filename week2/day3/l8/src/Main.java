import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations:
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        System.out.println("Please type in the expression: ");
        Scanner asd = new Scanner(System.in);
        String operation = asd.next();
        Integer operand1 = asd.nextInt();
        Integer operand2 = asd.nextInt();
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
            System.out.println("Please enter a valid operator like: +,-,%,/ or *");
        }
    }
}