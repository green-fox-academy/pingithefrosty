package Music;

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar() {
    name = "Electric Guitar";
    numberOfStrings = 6;
  }

  public ElectricGuitar(int strings) {
    name = "Electric Guitar";
    numberOfStrings = strings;
  }

  @Override
  public void sound() {
    this.sound = "Twang";
  }
}
