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
    fract(graphics,x,y,1,7);
  }
  private static void tri(Graphics g, int x, int y, int s) {
    g.drawPolygon(new int[] {x, x + 600 / s, x + 300 / s}, new int[] {y, y, y - 520 / s}, 3);
  }
  private static void revtrihalf(Graphics g, int x, int y, int s) {
    g.drawPolygon(new int[] {x + 300 / s, x + 450 / s, x + 150 / s}, new int[] {y, y - 260 / s, y - 260 / s}, 3);
  }
  private static void fract(Graphics g, int x, int y, int s, int n) {
    if (n == 0) {
      return;
    } else {
      revtrihalf(g, x, y, s);
      int x1 = x + 300/s;
      int x2 = x + 150/s;
      int y1 = y - 260/s;
      fract(g, x, y, s * 2, n - 1);
      fract(g, x1, y, s * 2, n - 1);
      fract(g, x2, y1, s * 2, n - 1);
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