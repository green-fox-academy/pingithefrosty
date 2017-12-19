import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hero extends Character {
  int x;
  int y;
  BufferedImage image;

  public void setImage(BufferedImage image) {
    this.image = image;
  }

  enum Directions {
    UP, DOWN, LEFT, RIGHT
  }

  public Hero() {
    x = 0;
    y = 0;
    try {
      image = ImageIO.read(new File("hero-down.png"));
      } catch (IOException e) {
      e.printStackTrace();
    }
    maxHP = 20 + 3 * rollDice();
    HP = maxHP;
    DP = 2 * rollDice();
    SP = 5 + rollDice();
    level = 1;
  }

  public void draw (Graphics g) {
    g.drawImage(image, x, y, null);
    g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
    g.drawString("Hero (Level " + level +") HP: " + HP + "/" + maxHP + " | DP: " + DP + " | SP: " + SP,5,750);
  }

  public void move(Map map, Directions dir) {
    int newX = x;
    int newY = y;

    switch (dir) {
      case UP:
        newY = y - 72;
        try {
          setImage(ImageIO.read(new File("hero-up.png")));
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;
      case DOWN:
        newY = y + 72;
        try {
          setImage(ImageIO.read(new File("hero-down.png")));
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;
      case LEFT:
        newX = x - 72;
        try {
          setImage(ImageIO.read(new File("hero-left.png")));
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;
      case RIGHT:
        newX = x + 72;
        try {
          setImage(ImageIO.read(new File("hero-right.png")));
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;
    }
    if ((newX < 720) && (newY < 720) && (newX > -1) && (newY > -1) && map.getTile(newX/72,newY/72).getFloor()) {
      x = newX;
      y = newY;
    }
  }
}