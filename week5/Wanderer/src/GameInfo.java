import java.awt.*;

public class GameInfo {
  Hero hero;
  Board board;

  public void draw (Graphics g) {
    g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
    g.drawString("Hero (Level " + hero.level +") " +
        "HP: " + hero.HP + "/" + hero.maxHP + " | " +
        "DP: " + hero.DP + " | " +
        "SP: " + hero.SP,5,750);
  }
}
