public class Power {
  public static void main(String[] args) {
    int n = 4;
    int power = 4;
    System.out.println(powerN(n,power));
  }

  private static int powerN(int n, int power) {
    if (power == 0) {
      return 1;
    } else {
      return n * powerN(n,power - 1);
    }
  }
}

