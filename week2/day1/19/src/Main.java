import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userinput = scanner.nextInt();
        if (userinput <= 0){
            System.out.println("Not enough");
        } else if (userinput == 1){
            System.out.println("One");
        } else if (userinput == 2){
            System.out.println("Two");
        } else {
            System.out.println("A lot");
        }
    }
}
