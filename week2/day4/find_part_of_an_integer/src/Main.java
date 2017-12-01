import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int userinput = asd.nextLine();
        int userinput2 = asd.nextLine();
        String[] parts = userinput.split(" ");
        for (int i = 0; i < parts.length; i++) {
            input.add(parts[i]);
        }
        for (int j = 0; j < input.size(); j++) {
            if (input.get(j).contains(userinput2)){
                result.add(String.valueOf(j));
            }
        }
        System.out.println(input);
        System.out.println(result);
    }
}

/*
Create a function that takes a number and a list of numbers as a parameter
Returns the indices of the numbers in the list where the first number is part of
Returns an empty list if the number is not part any of the numbers in the list

input: [1, 11, 34, 52, 61], 1
output: [0, 1, 4]
 */