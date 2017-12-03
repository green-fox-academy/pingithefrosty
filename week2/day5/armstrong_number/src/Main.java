import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        int input = asd.nextInt();
        String temp = String.valueOf(input);
        double power = temp.length();
        ArrayList<Double> array= new ArrayList<>();
        for (int i = 0; i < power ; i++) {
            double digit = Double.parseDouble(String.valueOf(temp.charAt(i)));
            double digitPowered = Math.pow(digit,power);
            array.add(digitPowered);
            }
        int input2 = 0;
        for (int j = 0; j < array.size(); j++) {
            input2 += array.get(j);
        }
        if (input == input2){
            System.out.println("The " + input + " is an Armstrong number.");
        } else {
            System.out.println("The " + input + " is not an Armstrong number.");
        }
        }
    }

/*
What is Armstrong number?

An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its digits.
Let's demonstrate this for a 4-digit number: 1634 is a 4-digit number, raise each digit to the fourth
power, and add: 1^4 + 6^4 + 3^4 + 4^4 = 1634, so it is an Armstrong number.
For a 3-digit number: 153 is a 3-digit number, raise each digit to the third power, and
add: 1^3 + 5^3 + 3^3 = 153, so it is an Armstrong number.
Exercise

Write a simple program to check if a given number is an armstrong number. The program should ask for
a number. E.g. if we type 371, the program should print out: The 371 is an Armstrong number.
 */