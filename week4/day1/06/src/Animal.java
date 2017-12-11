public class Animal {
  String name;
  int hunger;
  int thirst;

  public Animal(){
    this("unknown", 50, 50);
  }

  public Animal(String name, int hunger, int thirst) {
    this.name = name;
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public void eat(){
    this.hunger += 1;
  }

  public void drink(){
    this.thirst += 1;
  }

  public void play(){
    this.hunger -= 1;
    this.thirst -= 1;
  }

  public static void main(String[] args) {
    Animal animal = new Animal();
    Animal animal2 = new Animal("Tiger",60,60);
  }
}
