import javax.swing.*;
import java.util.List;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

  public List<String> maze() {
    Path path = Paths.get("maze.txt");
    List<String> layout = null;
    try {
      layout = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return layout;
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    graphics.fillRect(testBoxX, testBoxY, 1000, 1000);
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (maze().get(j).charAt(i) == '0') {
          PosIm image = new PosIm ("floor", i*100, j*100, true);
          image.draw(graphics);
        } else {
          PosIm image = new PosIm ("wall", i*100, j*100, false);
          image.draw(graphics);
        }
      }
    }
    hero.draw(graphics);
  }


  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods
    frame.addKeyListener(board);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener
    hero = new Hero();
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      hero.move(Hero.Directions.UP);
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.move(Hero.Directions.DOWN);
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.move(Hero.Directions.LEFT);
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.move(Hero.Directions.RIGHT);
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}