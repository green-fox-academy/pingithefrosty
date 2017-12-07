public class Bunny2 {
  public static void main(String[] args) {
    int n = 4;
    System.out.println(powerN(n));
  }

  private static int powerN(int n) {
    if (n == 0) {
      return 0;
    } else if (n % 2 == 0){
      return powerN(n-1) + 3;
    } else {
      return powerN(n-1) + 2;
    }
  }
}