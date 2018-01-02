package Animals;

public class Reptile extends Animal {
  public Reptile(String type) {
    name = type;
    breedType = "laying eggs";
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