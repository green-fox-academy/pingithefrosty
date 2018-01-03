import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    String string = "asklkLKkdaKpSSsdopq";
    String[] arrayString = string.split("");
    Arrays.stream(arrayString).filter(n -> n.toUpperCase().equals(n)).forEach(System.out::print);
  }
}
