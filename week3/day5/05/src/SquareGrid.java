import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.black);
    int x = 310;
    int y = 310;
    square(graphics, x, y, 2);
    fract(graphics, x, y, 2, 4);
  }

  private static void square(Graphics g, int x, int y, int s, int t) {
    Graphics2D g2 = (Graphics2D) g;
    BasicStroke strokeThick = new BasicStroke(t);
    g2.setStroke(strokeThick);
    g.drawLine(x - 300 / s, y - 300 / s, x + 300 / s, y - 300 / s);
    g.drawLine(x - 300 / s, y + 300 / s, x - 300 / s, y - 300 / s);
    g.drawLine(x + 300 / s, y + 300 / s, x - 300 / s, y + 300 / s);
    g.drawLine(x + 300 / s, y - 300 / s, x + 300 / s, y + 300 / s);
  }

  private static void fract(Graphics g, int x, int y, int s, int n) {
    if (n == 0) {
      return;
    } else {
      square(g, x, y, s);
      int x1 = x - 300 / s;
      int x2 = x + 300 / s;
      int y1 = y - 300 / s;
      int y2 = y + 300 / s;

      fract(g, x1, y1, s * 2, n - 1);
      fract(g, x2, y2, s * 2, n - 1);
      fract(g, x1, y2, s * 2, n - 1);
      fract(g, x2, y1, s * 2, n - 1);
    }
  }


  static int WIDTH = 650;
  static int HEIGHT = 900;
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


