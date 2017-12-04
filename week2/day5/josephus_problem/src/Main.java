import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Josephus cave. How many people are inside?");
        Scanner asd = new Scanner(System.in);
        int input = asd.nextInt();
        int powerTwo = largestPowerOfTwo(input);
        int result = 2*(input-powerTwo)+1;
        System.out.println("You should stand at place: "+result+".");
    }

    private static int largestPowerOfTwo(int n) {
            while((n & n-1) != 0){
                n = n & n-1;
            }
            return n;
    }
}