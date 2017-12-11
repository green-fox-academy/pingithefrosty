import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    System.out.println(dominoes);
    dominoes.add(1,dominoes.get(4));
    dominoes.remove(5);
    dominoes.add(3,dominoes.get(4));
    dominoes.remove(5);
    dominoes.add(4,dominoes.get(5));
    dominoes.remove(5);
    System.out.println(dominoes);
  }


  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
