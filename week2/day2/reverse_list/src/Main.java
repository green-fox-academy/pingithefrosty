import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`
        int[] aj = {3,4,5,6,7};
        int temp1 = aj[0];
        int temp2 = aj[1];
        aj[0]=aj[4];
        aj[1]=aj[3];
        aj[4]=temp1;
        aj[3]=temp2;
        System.out.print(Arrays.toString(aj));
    }
}
