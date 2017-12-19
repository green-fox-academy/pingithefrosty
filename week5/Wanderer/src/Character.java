import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Character {
  private Image image;
  private String fileName;
  protected int maxHP;
  protected int HP;
  protected int DP;
  protected int SP;
  protected int level = 1;
  protected int x;
  protected int y;

  int rollDice() {
    return (int)(Math.random() * 5) + 1;
  }
}
