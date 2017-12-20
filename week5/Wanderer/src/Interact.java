import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Interact {
  private int stage;
  private Hero hero;
  private List<Monster> monsterList;
  private int monsterAmount;
  private Monster keyMonster;
  private Monster monster;
  private Boss boss;
  private Map map;

  public Interact() {

  }

  public int getStage() {
    return stage;
  }

  public void setStage(int stage) {
    this.stage = stage;
  }
}
