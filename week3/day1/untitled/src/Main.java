public class Main {

  public static void main(String[] args) {
    String original = "ghijkl/ a";
    for (int i = 0; i < original.length(); i++) {
      System.out.println ((char)(((int) original.charAt(i))-1));
    }
  }
}