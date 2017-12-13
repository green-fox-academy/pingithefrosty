import java.util.ArrayList;
import java.util.List;

public class Garden {
  public static void main(String[] args) {
    Flower flower1 = new Flower("pink");
    Tree tree1 = new Tree("red");

    info();

  }


  static List<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public void addFlower(Flower flower) {
    plants.add(flower);
  }

  public void addTree(Tree tree) {
    plants.add(tree);
  }

  public static void info() {
    System.out.println("The Garden has " + plants.size() + " plants in it.");
  }

  public void watering(int waterAmount) {
    List<Plant> needsWaterList = new ArrayList<>();
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).getNeedsWater()) {
        needsWaterList.add(plants.get(i));
      }
    }
    float actualWateredAmount = waterAmount / needsWaterList.size();
    for (int j = 0; j < needsWaterList.size(); j++) {
      needsWaterList.get(j).setWaterLevel(needsWaterList.get(j).getWaterLevel() + actualWateredAmount);
    }
  }


}
/*
is able to hold unlimited amount of flowers or trees
when watering it should only water those what needs water with equally divided amount amongst them
eg. watering with 40 and 4 of them need water then each gets watered with 10
 */