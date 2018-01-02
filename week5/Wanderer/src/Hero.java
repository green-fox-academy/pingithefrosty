public class Hero extends Character {
  private static final String heroD = "heroD.png";

  public Hero() {
    super();
    setImage(heroD);
    x = 0;
    y = 0;
    maxHP = 20 + 3 * rollDice();
    HP = maxHP;
    DP = 2 * rollDice();
    SP = 5 + rollDice();
    level = 1;
  }

  public void die() {

  }

  public void areaBonus() {

  }
}