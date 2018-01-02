import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class Board extends JComponent implements KeyListener {

  static int testBoxX;
  static int testBoxY;
  static Hero hero;
  static Map map;
  static Monster monster;
  static Boss boss;
  static int stage;
  static List<Monster> monsterList;
  static int monsNum;
  static Monster keyMonster;

  public Board() {
    testBoxX = 0;
    testBoxY = 0;
    setPreferredSize(new Dimension(720, 800));
    setVisible(true);
    map = new Map();
    hero = new Hero();

/*    this.stage = 1;
    monsNum = 2;
    monsterList = new ArrayList<>();
    for (int i = 0; i < monsNum; i++) {
      monster = new Monster(map.getRandFloor(i).getX()*72,map.getRandFloor(i).getY()*72,stage);
      monsterList.add(monster);
    }
    keyMonster = new Monster(map.getRandFloor(monsNum +1).getX()*72,map.getRandFloor(monsNum +1).getY()*72,stage);
    monsterList.add(keyMonster);
    boss = new Boss(map.getRandFloor(monsNum +2).getX()*72,map.getRandFloor(monsNum +2).getY()*72,stage);
    monsterList.add(boss);*/
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);
    g.fillRect(0, 0, 720, 720);
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        g.drawImage(map.getTile(i, j).getImage(), i * 72, j * 72, null);
      }
 /*   }
    for (int i = 0; i < monsterList.size(); i++) {
      monsterList.get(i).draw(g);*/
    }
    hero.draw(g);
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      hero.move(map,Hero.Directions.UP);
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.move(map,Hero.Directions.DOWN);
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.move(map,Hero.Directions.LEFT);
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.move(map,Hero.Directions.RIGHT);
    } /*else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
      for(int i = 0; i < monsterList.size(); i ++) {
        if (monsterList.get(i).x == hero.x && monsterList.get(i).y == hero.y) {
          hero.attack(monsterList.get(i));
          if(monsterList.get(i).isDead()){
            monsterList.remove(i);
          } else {
            monsterList.get(i).attack(hero);
          }
        }
      }
    }*/
    repaint();
  }
}