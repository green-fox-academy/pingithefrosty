import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursionSquare {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.yellow);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    fourSquareDrawer(graphics,
    int x = WIDTH;
    int y = HEIGHT;
    graphics.setColor(Color.black);
    graphics.drawRect(0,0,x,y);
    fract(graphics,x,y);
  }

  private static void fourSquareDrawer(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
    g.drawLine((x1+x2)/3,(y1+y2)/3,(x3+x4)/6,y/3);

  }

  static int WIDTH = 800;
  static int HEIGHT = 800;
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
