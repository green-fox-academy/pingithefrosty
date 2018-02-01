import java.util.*;

public class PirateCounter{
  public static void main(String... args){
    ArrayList<Pirate> pirates = new ArrayList<>();

    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));

    System.out.println(richPiratesWithWoodenLeg(pirates));
  }

  //Returns the listed names of pirates who have a wooden leg and more than 15 gold.
  private static ArrayList richPiratesWithWoodenLeg(ArrayList<Pirate> pirates) {
    ArrayList<String> coolPirates = new ArrayList<>();
    for (int i = 0; i < pirates.size(); i++) {
      if ((pirates.get(i).getGold() > 15) && (pirates.get(i).isHasWoodenLeg())) {
        coolPirates.add(pirates.get(i).getName());
      }
    }
    return coolPirates;
  }
}
