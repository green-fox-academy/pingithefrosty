import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursiveHexagon {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.yellow);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    graphics.setColor(Color.black);
    graphics.drawRect(0,0,WIDTH,HEIGHT);
    fract(graphics,450,450,450,5);
  }

  private static void fourSquareDrawer(Graphics g, int x, int y, int s) {
    g.drawLine(x-s/3,y-s,x-s/3,y+s);
    g.drawLine(x+s/3,y-s,x+s/3,y+s);
    g.drawLine(x-s,y-s/3,x+s,y-s/3);
    g.drawLine(x-s,y+s/3,x+s,y+s/3);
  }

  private static void fract(Graphics g, int x, int y, int s, int n) {
    if (n == 0) {
      return;
    } else {
      fourSquareDrawer(g,x,y,s);
      int x1 = x + 2*s/3;
      int y1 = y + 2*s/3;
      int x2 = x - 2*s/3;
      int y2 = y - 2*s/3;
      g.setColor(Color.black);
      fract(g,x,y1,s/3,n-1);
      g.setColor(Color.MAGENTA);
      fract(g,x,y2,s/3,n-1);
      g.setColor(Color.blue);
      fract(g,x1,y,s/3,n-1);
      g.setColor(Color.red);
      fract(g,x2,y,s/3,n-1);
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
