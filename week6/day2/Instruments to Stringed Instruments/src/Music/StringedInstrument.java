package Music;

public abstract class StringedInstrument extends Instrument {
  int numberOfStrings;
  protected String sound;
  protected abstract void sound();

  @Override
  public void play() {
    sound();
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound);
  }
}
