import java.util.ArrayList;

public class Sum {
  public static int sum(ArrayList<Integer> list1) {
    int listSum = 0;
    for (int i = 0; i < list1.size(); i++) {
      listSum = listSum + list1.get(i);
    }
    return listSum;
  }
}
