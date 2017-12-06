import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {
  public static void mainDraw(Graphics graphics) {
    squareDrawer(graphics, 30);
    squareDrawer(graphics, 100);
    squareDrawer(graphics, 200);
  }
  private static void squareDrawer(Graphics g, int x) {
    g.drawRect((WIDTH-x)/2,(HEIGHT-x)/2,x,x);
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