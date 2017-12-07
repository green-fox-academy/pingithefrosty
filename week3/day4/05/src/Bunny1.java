public class Bunny1 {
  public static void main(String[] args) {
    int n = 3333;
    System.out.println(bunnyN(n));
  }

  private static int bunnyN(int n) {
    if (n == 0) {
      return 0;
    } else {
      return bunnyN(n-1) + 2;
    }
  }
}

