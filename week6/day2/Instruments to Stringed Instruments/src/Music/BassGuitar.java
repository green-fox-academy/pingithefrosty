package Music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    name = "Bass Guitar";
    numberOfStrings = 4;
  }

  public BassGuitar(int strings) {
    name = "Bass Guitar";
    numberOfStrings = strings;
  }

  @Override
  public void sound() {
    this.sound = "Duum-duum-duum";
  }
}
