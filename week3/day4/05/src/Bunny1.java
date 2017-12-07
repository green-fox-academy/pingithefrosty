public class Bunny1 {
  public static void main(String[] args) {
    int n = 10;
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

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively
// (without loops or multiplication).

