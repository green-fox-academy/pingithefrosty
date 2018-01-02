package Music;

public class Violin extends StringedInstrument {
  public Violin() {
    name = "Violin";
    numberOfStrings = 4;
  }

  @Override
  public void sound() {
    this.sound = "Screech";
  }
}
