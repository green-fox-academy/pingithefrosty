import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Monster extends Character {
  private static final String skeleton = "skeleton.png";

  public Monster(int x, int y, int stage) {
    this.x = x;
    this.y = y;
    setImage(skeleton);
    maxHP = 2 * stage * rollDice();
    HP = maxHP;
    DP = stage / 2 * rollDice();
    SP = stage * rollDice();
    level = 1;
  }

  public Monster() {
  }
/*
  public void move (Map map) {
    int newX = x/72;
    int newY = y/72;
    ArrayList<Tile> options = new ArrayList<>();
    if (newX == 0) {
      if ((newY < 10) && (newY > -1) && map.getTile(newX + 1, newY).getFloor()) {
        options.add(map.getTile(newX + 1,newY));
      }
      if ((newY < 10) && (newY > -1) && map.getTile(newX, newY + 1).getFloor()) {
        options.add(map.getTile(newX,newY + 1));
      }
    } else if (newY == 0) {
      if ((newX < 10) && (newX > -1)&& map.getTile(newX + 1, newY).getFloor()) {
        options.add(map.getTile(newX + 1,newY));
      }
      if ((newX < 10)&& (newX > -1) && map.getTile(newX, newY + 1).getFloor()) {
        options.add(map.getTile(newX,newY + 1));
      }
    } else {
      if ((newX < 10) && (newY < 10) && (newX > -1) && (newY > -1) && map.getTile(newX - 1, newY).getFloor()) {
        options.add(map.getTile(newX - 1,newY));
      }
      if ((newX < 10) && (newY < 10) && (newX > -1) && (newY > -1) && map.getTile(newX + 1, newY).getFloor()) {
        options.add(map.getTile(newX + 1,newY));
      }
      if ((newX < 10) && (newY < 10) && (newX > -1) && (newY > -1) && map.getTile(newX, newY - 1).getFloor()) {
        options.add(map.getTile(newX,newY - 1));
      }
      if ((newX < 10) && (newY < 10) && (newX > -1) && (newY > -1) && map.getTile(newX, newY + 1).getFloor()) {
        options.add(map.getTile(newX,newY + 1));
      }
    }
    int random = (int)(Math.random() * options.size()-1) + 1;
    x = options.get(random).getX();
    y = options.get(random).getY();
    System.out.println(options);
  }*/

}
