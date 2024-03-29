public class Dice {
  int[] dices = new int[6];

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }

  @Override
  public String toString() {
    return "[" + dices[0] + ", " + dices[1] + ", " + dices[2] + ", " + dices[3] + ", " + dices[4] + ", " + dices[5] + "]";
  }
  public static void main(String[] args) {
    Dice myDice = new Dice();
    myDice.roll();
    for (int i = 0; i < 6 ; i++) {
      while (myDice.getCurrent(i) != 6) {
        myDice.reroll(i);
      }
    }
    System.out.println(myDice);
    }
  }