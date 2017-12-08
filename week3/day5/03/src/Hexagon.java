import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {
  public static void mainDraw(Graphics graphics) {
    int r = 800;
    int x = 420-r/2;
    int y = 420-r/2;
    fract(graphics,x,y,r,1, 5);
  }

  private static void fract(Graphics g, int x, int y, int r, int s, int n) {
    if (n == 0) {
      return;
    } else {
      g.drawOval(x, y, r/s, r/s);
      int x1 = x + r/(s*4);
      int y1 = y + r/(s*4);
      int x2 = x + r/(s*2);
      int y2 = y + r/(s*2);
      fract(g,x1,y,r,s*2,n-1);
      fract(g,x,y1,r,s*2,n-1);
      fract(g,x2,y1,r,s*2,n-1);
      fract(g,x1,y2,r,s*2,n-1);
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