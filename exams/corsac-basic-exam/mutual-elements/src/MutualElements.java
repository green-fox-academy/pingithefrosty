import java.util.*;

public class MutualElements {
  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4));
    List<Integer> b = new ArrayList<>(Arrays.asList(3, 4, 4, 5, 6));
    System.out.println(filterMutualElements(a, b));
  }

  public static List<Integer> filterMutualElements(List<Integer> a, List<Integer> b) {
    Set<Integer> mutualSet = new TreeSet<>();
    List<Integer> mutualList = new ArrayList<>();
    for (int i = 0; i < a.size(); i++) {
      for (int j = 0; j < b.size(); j++) {
        if (Objects.equals(a.get(i), b.get(j))) {
          mutualSet.add(a.get(i));
        }
      }
    }
    mutualList.addAll(mutualSet);
    return mutualList;
  }
}
