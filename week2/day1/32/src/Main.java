import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        int input = asd.nextInt();
        for (int i = 0; i < input; i++){
            for (int j=0; j < input; j++){
                if (i == 0 || i == (input - 1)){
                    System.out.print("%");
                } else if (j == 0 || j == (input - 1)){
                    System.out.print("%");
                } else if (i == j){
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
