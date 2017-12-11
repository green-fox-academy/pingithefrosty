public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    Thing thing1 = new Thing("Get milk");
    fleet.add(thing1);
    Thing thing2 = new Thing("Remove the obstacles");
    fleet.add(thing2);
    Thing thing3 = new Thing("Stand up");
    fleet.add(thing3);
    Thing thing4 = new Thing("Eat lunch");
    fleet.add(thing4);
    thing3.complete();
    thing4.complete();
    System.out.println(fleet);
  }
}