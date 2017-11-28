import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        int input = asd.nextInt();
        System.out.print(factorial(input));
    }
    public static int factorial (int input){
        int sum = 1;
        for (int i = 1; i <= input; i++){
            sum *= i;
        }
        return sum;
    }
}

