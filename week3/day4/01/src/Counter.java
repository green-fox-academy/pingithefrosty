public class Counter {
  public static void main(String[] args) {
    factorialWithRecursion(10);
  }

  private static int factorialWithRecursion(int n) {
    System.out.println(n);
    if (n == 0) {
      return 0;
    } else {
      return factorialWithRecursion(n - 1);
    }
  }
}

