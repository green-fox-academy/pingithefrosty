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
