public class Shifter implements CharSequence {
  String str;
  int numberToShift;

  public Shifter(String str, int numberToShift) {
    this.str = str;
    this.numberToShift = numberToShift;
  }

  public static void main(String[] args) {
    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));
    // should print out: a
  }

  @Override
  public int length() {
    return str.length();
  }

  @Override
  public char charAt(int index) {
    return str.charAt(index + numberToShift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return str.subSequence(str.length() - end, str.length() - start);
  }
}
