import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
  String basicString;

  public Gnirts(String basicString) {
    this.basicString = basicString;
  }

  public static void main(String[] args) {
    Gnirts g = new Gnirts("example");
    System.out.println(g.charAt(1));
    System.out.println(g.subSequence(1,3));
  }

  @Override
  public int length() {
    return basicString.length();
  }

  @Override
  public char charAt(int index) {
    return basicString.charAt(basicString.length() - index - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return basicString.subSequence(basicString.length() - end, basicString.length() - start);
  }
}
