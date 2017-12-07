public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(factorialWithRecursion(10));
  }

  private static int factorialWithRecursion(int n) {
    if (n == 0) {
      return 0;
    } else {
      return n + factorialWithRecursion(n - 1);
    }
  }
}
