import com.sun.javafx.scene.traversal.Direction;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Character extends GameObject{
  protected int maxHP;
  protected int HP;
  protected int DP;
  protected int SP;
  protected int level;
  private static final String heroD = "heroD.png";
  private static final String heroR = "heroR.png";
  private static final String heroL = "heroL.png";
  private static final String heroU = "heroU.png";

  enum Directions {
    UP, DOWN, LEFT, RIGHT
  }

  public Character() {
  }

  public void move (Direction directions) {

  }

  int rollDice() {
    return new Random().nextInt(6) + 1;
  }

  public void die() {

  }

  public void levelUp() {
    this.maxHP += rollDice();
    this.DP += rollDice();
    this.SP += rollDice();
  }

  public void attack (Character enemy) {
  }

  public void move(Map map, Hero.Directions dir) {
    int newX = x/72;
    int newY = y/72;

    switch (dir) {
      case UP:
        newY = y - 1;
        setImage(heroU);
        break;
      case DOWN:
        newY = y + 1;
        setImage(heroD);
        break;
      case LEFT:
        newX = x - 1;
        setImage(heroL);
        break;
      case RIGHT:
        newX = x + 1;
        setImage(heroR);
        break;
    }

    if ((newX < 10) && (newY < 10) && (newX > -1) && (newY > -1)
        && map.getTile(newX,newY).getFloor()) {
      x = newX*72;
      y = newY*72;
    }
  }
}
