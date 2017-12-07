public class SumDigit {
  public static void main(String[] args) {
    int n = 21646;
    System.out.println(sumRec(n));
  }

  private static int sumRec(int n) {
    if (n / 10 < 1) {
      return n;
    } else {
      return sumRec(n / 10) + n % 10;
    }
  }
}