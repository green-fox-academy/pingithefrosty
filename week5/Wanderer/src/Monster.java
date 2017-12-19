import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Monster extends Character {
  int x;
  int y;
  BufferedImage image;

  public Monster(Map map) {
    int random = (int) (Math.random() * map.getFloorList().size());
    x = map.getFloorList().get(random).getX()*72;
    y = map.getFloorList().get(random).getY()*72;
    try {
      image = ImageIO.read(new File("skeleton.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    maxHP = 2 * stage * rollDice();
    HP = maxHP;
    DP = stage/2 * rollDice();
    SP = stage * rollDice();
    level = 1;
    /*
    HP: 2 * x * d6 (+d6)
DP: x/2 * d6 (+d6/2)
SP: x * d6 (+x)
     */
  }

  public void draw (Graphics graphics) {
    graphics.drawImage(image, x, y, null);
  }
}
