import java.util.ArrayList;
import java.util.Arrays;

public class Seconds {
  public static void main(String[] args) {
    ArrayList<Integer> originalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(listHalver(originalList));
  }

  //returns every second element as a list from a list
  private static ArrayList listHalver(ArrayList<Integer> originalList) {
    ArrayList<Integer> halvedList = new ArrayList<>();
    for (int i = 0; i < originalList.size(); i++) {
      if (i % 2 != 0) {
        halvedList.add(originalList.get(i));
      }
    }
    return halvedList;
  }
}
