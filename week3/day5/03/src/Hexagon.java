import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.black);
    int x = 310;
    int y = 310;
    hex(graphics, x, y, 1);
    fract(graphics, x, y, 1, 5);
  }

  private static void hex(Graphics g, int x, int y, int s) {
    g.drawLine(x + 150 / s, y - 260 / s, x + 300 / s, y);
    g.drawLine(x + 150 / s, y - 260 / s, x - 150 / s, y - 260 / s);
    g.drawLine(x - 150 / s, y - 260 / s, x - 300 / s, y);
    g.drawLine(x + 150 / s, y + 260 / s, x + 300 / s, y);
    g.drawLine(x + 150 / s, y + 260 / s, x - 150 / s, y + 260 / s);
    g.drawLine(x - 150 / s, y + 260 / s, x - 300 / s, y);
  }

  private static void fract(Graphics g, int x, int y, int s, int n) {
    if (n == 0) {
      return;
    } else {
      hex(g, x, y, s);
      int x1 = x + 200/s;
      int x2 = x - 200/s;
      int x3 = x + 100/s;
      int x4 = x - 100/s;
      int y1 = y + 173/s;
      int y2 = y - 173/s;
      fract(g, x1, y, s * 3, n - 1);
      fract(g, x2, y, s * 3, n - 1);
      fract(g, x3, y1, s * 3, n - 1);
      fract(g, x4, y1, s * 3, n - 1);
      fract(g, x3, y2, s * 3, n - 1);
      fract(g, x4, y2, s * 3, n - 1);
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


