import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        int input = asd.nextInt();
        System.out.print(summing(input));
    }
    public static int summing (int input){
        int sum = 0;
        for (int i = 0; i <= input; i++){
           sum += i;
        }
        return sum;
    }
}
