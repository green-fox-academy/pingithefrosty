package Animals;

public abstract class Animal {
  String name;
  String breedType;
  int age;
  boolean isFemale;
  int limbs;
  abstract void move();
  abstract String getName();
  abstract String breed();
}
