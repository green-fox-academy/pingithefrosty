import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Boss extends Character {
  int x;
  int y;
  BufferedImage image;

  public Boss(Map map) {
    int random = (int) (Math.random() * map.getFloorList().size());
    x = map.getFloorList().get(random).getX()*72;
    y = map.getFloorList().get(random).getY()*72;
    try {
      image = ImageIO.read(new File("boss.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    maxHP = 2 * stage * rollDice() + rollDice();
    HP = maxHP;
    DP = stage/2 * rollDice() + rollDice()/2;
    SP = stage * rollDice() + stage;
    level = 1;
  }

  public void draw (Graphics graphics) {
    graphics.drawImage(image, x, y, null);
  }
}