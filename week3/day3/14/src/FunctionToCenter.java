import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    for (int i = 0; i < WIDTH / 20; i++) {
      int x = i * 20;
      int y = 0;
      lineDrawer(graphics, x, y);
      x = 320;
      y = i * 20;
      lineDrawer(graphics, x, y);
      x = i * 20;
      y = 320;
      lineDrawer(graphics, x, y);
      x = 0;
      y = i * 20;
      lineDrawer(graphics, x, y);
      }
    }

  private static void lineDrawer(Graphics g, int x, int y) {
    g.drawLine(x,y,WIDTH/2,HEIGHT/2);
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