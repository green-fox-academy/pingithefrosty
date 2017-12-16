import java.util.ArrayList;
import java.util.List;

public class Garden {
  public static void main(String[] args) {
    List<Plant> plants = new ArrayList<>();
    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");
    Tree tree1 = new Tree("purple");
    Tree tree2 = new Tree("orange");
    plants.add(flower1);
    plants.add(flower2);
    plants.add(tree1);
    plants.add(tree2);
    info(plants);
    watering(plants, 40);
    info(plants);
    watering(plants, 70);
    info(plants);
  }

  public static void info(List<Plant> plants) {
    for (int i = 0; i < plants.size(); i++) {
      System.out.println("The " + plants.get(i).getColor() + " " + plants.get(i).getClass().getSimpleName() +
          needsWaterInfo(plants.get(i).getNeedsWater()));
    }
    System.out.println();
  }

  public static String needsWaterInfo (Boolean a) {
    return a ? " needs water" : " doesn't need water";
  }

  public static void watering(List<Plant> plants, int waterAmount) {
    System.out.println("Watering with " + waterAmount);
    List<Plant> nWL = new ArrayList<>();
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).getNeedsWater()) {
        nWL.add(plants.get(i));
      }
    }
    float actualWateredAmount = waterAmount / nWL.size();
    for (int j = 0; j < nWL.size(); j++) {
      if (nWL.get(j) instanceof Flower) {
        nWL.get(j).setWaterLevel(nWL.get(j).getWaterLevel() + actualWateredAmount * 0.75);
      } else if (nWL.get(j) instanceof Tree) {
        nWL.get(j).setWaterLevel(nWL.get(j).getWaterLevel() + actualWateredAmount * 0.4);//how to get absorb?
      }
    }
    for (int k = 0; k < plants.size(); k++) {
      if (plants.get(k) instanceof Flower) {
        plants.get(k).setNeedsWater(plants.get(k).getWaterLevel() < 5);
      } else if (plants.get(k) instanceof Tree) {
        plants.get(k).setNeedsWater(plants.get(k).getWaterLevel() < 10);
      }
    }
  }
}



/*
is able to hold unlimited amount of flowers or trees
when watering it should only water those what needs water with equally divided amount amongst them
eg. watering with 40 and 4 of them need water then each gets watered with 10
 */