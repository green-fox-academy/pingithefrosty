import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    ArrayList<Fox> listOfFoxes = new ArrayList<>();
    Fox fox1 = new Fox("Jack", "pallida", "green");
    Fox fox2 = new Fox("Jane", "badcat", "red");
    Fox fox3 = new Fox("John", "pallida", "blue");
    Fox fox4 = new Fox("Jean", "please", "green");
    Fox fox5 = new Fox("Johnny", "asbest", "green");
    listOfFoxes.add(fox1);
    listOfFoxes.add(fox2);
    listOfFoxes.add(fox3);
    listOfFoxes.add(fox4);
    listOfFoxes.add(fox5);

    System.out.println("Foxes with green color");
    listOfFoxes.stream()
        .filter(n -> n.color == "green")
        .forEach(n -> System.out.println(n.name));
    System.out.println();

    System.out.println("Foxes with green color and pallida type");
    List<Fox> greenPallidaFoxes = listOfFoxes.stream()
        .filter(n -> n.color == "green" && n.type == "pallida")
        .collect(Collectors.toList());
    System.out.println(greenPallidaFoxes);
  }
}
