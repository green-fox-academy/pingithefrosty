public class Boss extends Monster {
  private static final String boss = "boss.png";

  public Boss(int x, int y, int stage) {
    this.x = x;
    this.y = y;
    setImage(boss);
    maxHP = 2 * stage * rollDice() + rollDice();
    HP = maxHP;
    DP = stage / 2 * rollDice() + rollDice()/2;
    SP = stage * rollDice() + stage;
    level = 1;
  }
}