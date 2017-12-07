import  java.util.Scanner;

public class String3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a string: ");
    String newString = scanner.nextLine();
    System.out.println(convertxy(newString));
  }

  private static String convertxy(String n) {
    if (n.length() == 0) {
      return "";
    } else if (n.length() == 1){
      return n.charAt(0) + convertxy(n.substring(1, n.length()));
    } else {
      return n.charAt(0) + "*" + convertxy(n.substring(1, n.length()));
    }
  }
}

// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
