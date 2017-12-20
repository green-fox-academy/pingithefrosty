import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static java.awt.Event.DOWN;
import static java.awt.Event.UP;

public class Monster extends Character {
  int x;
  int y;
  BufferedImage image;

  public Monster(int x, int y, int stage) {
    this.x = x;
    this.y = y;
    try {
      image = ImageIO.read(new File("skeleton.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    maxHP = 2 * stage * rollDice();
    HP = maxHP;
    DP = stage / 2 * rollDice();
    SP = stage * rollDice();
    level = 1;
  }

  public Monster() {
  }

  public void move (Map map) {
    int newX = x;
    int newY = y;
    ArrayList<Tile> options = new ArrayList<>();
    if ((newX < 720) && (newY < 720) && (newX > -1) && (newY > -1) && map.getTile(newX/72 - 1,newY/72).getFloor()) {
      options.add(map.getTile(newX/72 - 1,newY/72));
    }
    if ((newX < 720) && (newY < 720) && (newX > -1) && (newY > -1) && map.getTile(newX/72 + 1,newY/72).getFloor()) {
      options.add(map.getTile(newX/72 + 1,newY/72));
    }
    if ((newX < 720) && (newY < 720) && (newX > -1) && (newY > -1) && map.getTile(newX/72,newY/72 - 1).getFloor()) {
      options.add(map.getTile(newX/72,newY/72 - 1));
    }
    if ((newX < 720) && (newY < 720) && (newX > -1) && (newY > -1) && map.getTile(newX/72,newY/72 + 1).getFloor()) {
      options.add(map.getTile(newX/72, newY/72 + 1));
    }
    int random = (int)(Math.random() * options.size()-1) + 1;
    x = options.get(random).getX() * 72;
    y = options.get(random).getY() * 72;
    System.out.println(options);
  }

  public void draw (Graphics graphics) {
    graphics.drawImage(image, x, y, null);
  }
}
