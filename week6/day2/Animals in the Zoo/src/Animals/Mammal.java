package Animals;

public class Mammal extends Animal {
  public Mammal(String type) {
    name = type;
    breedType = "pushing miniature versions out";
  }

  @Override
  void move() {

  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String breed() {
    return this.breedType;
  }
}
