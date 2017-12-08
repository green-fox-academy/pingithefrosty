import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.black);
    int x = 310;
    int y = 310;
    hex(graphics, x, y, 1);
    fract(graphics, x, y, 2, 7);
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
      int y1 = y - 780/(2*s);
      fract(g, x, y1, s * 3, n - 1);
    }
  }


  static int WIDTH = 900;
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


