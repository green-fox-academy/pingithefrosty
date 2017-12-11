import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics){
    graphics.setColor(Color.black);
    int x = 50;
    int y = 610;
    tri(graphics, x, y, 1);
    revtrihalf(graphics, x, y, 1);
    fract(graphics,x,y,1,2);
  }

  private static void tri(Graphics g, int x, int y, int s) {
    g.drawLine(x, y, x + 600 / s, y);
    g.drawLine(x, y, x + 300 / s, y - 520 / s);
    g.drawLine(x + 600 / s, y, x + 300 / s, y - 520 / s);
  }
  private static void revtrihalf(Graphics g, int x, int y, int s) {
    g.drawLine(x+300/s,y,x+150/s,y-260/s);
    g.drawLine(x+300/s,y,x+450/s,y-260/s);
    g.drawLine(x+450/s,y-260/s,x+150/s,y-260/s);
  }

  private static void fract(Graphics g, int x, int y, int s, int n) {
    if (n == 0) {
      return;
    } else {
      int x1 = x + 300/s;
      int x2 = x + 150/s;
      int y1 = y - 260/s;
      int x3 = x + 225/s;
      int y2 = y - 130/s;
      int x4 = x + 75/s;
      tri(g, x3, y2, s*4);
      revtrihalf(g, x, y, s*2);
      revtrihalf(g, x1, y, s*2);
      revtrihalf(g, x2, y1, s*2);
      fract(g, x, y, s*2, n - 1);
      fract(g, x1, y, s*2, n - 1);
      fract(g, x2, y1, s*2, n - 1);
      fract(g, x3, y2, s*2, n - 1);
      fract(g, x4, y2, s*2, n - 1);
      fract(g, x2, y, s*2, n - 1);
    }
  }

  static int WIDTH = 700;
  static int HEIGHT = 700;

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