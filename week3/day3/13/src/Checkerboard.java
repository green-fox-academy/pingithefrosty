import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    for (int i = 0; i < WIDTH / 10; i++) {
      for (int j = 0; j < HEIGHT / 10; j++) {
        int x = i * 10;
        int y = j * 10;
        if (i % 2 == 0 && j % 2 == 0){
          graphics.setColor(Color.black);
        } else if (i % 2 != 0 && j % 2 != 0){
          graphics.setColor(Color.black);
        } else {
          graphics.setColor(Color.white);
        }
          squareDrawer(graphics, x, y);
        }
      }
    }

  private static void squareDrawer(Graphics g, int x, int y) {
    g.fillRect(x, y, 10, 10);
  }

  static int WIDTH = 320;
  static int HEIGHT = 343;
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}