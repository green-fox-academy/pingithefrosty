import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursionSquare {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.yellow);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    int x = 900;
    int y = 900;
    int s = 900;
    graphics.setColor(Color.black);
    graphics.drawRect(0,0,x,y);
    fract(graphics,x,y,s,3);
  }

  private static void fourSquareDrawer(Graphics g, int x, int y, int s) {
    g.drawLine(x-2*s/3,y-s,x-2*s/3,y);
    g.drawLine(x-s/3,y-s,x-s/3,y);
    g.drawLine(x-s,y-2*s/3,x,y-2*s/3);
    g.drawLine(x-s,y-s/3,x,y-s/3);
  }

  private static void fract(Graphics g, int x, int y, int s, int n) {
    if (n == 0) {
      return;
    } else {
      fourSquareDrawer(g,x,y,s);
      int x1 = 3*x - s;
      int y1 = 3*y - s;
      int x2 = 3*x;
      int y2 = 3*y;
      g.setColor(Color.blue);
      fract(g,x1/3,y/3,s/3,n-1);
      g.setColor(Color.black);
      fract(g,x/3,y1/3,s/3,n-1);
      g.setColor(Color.red);
      fract(g,x2/3,y1/3,s/3,n-1);
      g.setColor(Color.MAGENTA);
      fract(g,x1/3,y2/3,s/3,n-1);
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
