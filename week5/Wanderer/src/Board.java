import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  int testBoxX;
  int testBoxY;
  static Hero hero;


  public Board() {
    testBoxX = 0;
    testBoxY = 0;
    setPreferredSize(new Dimension(1000, 1000));
    setVisible(true);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
    map = new Map();
    hero = new Hero();
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
      hero.move(Hero.Directions.UP);
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.move(Hero.Directions.DOWN);
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.move(Hero.Directions.LEFT);
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.move(Hero.Directions.RIGHT);
    }
    repaint();
  }
}