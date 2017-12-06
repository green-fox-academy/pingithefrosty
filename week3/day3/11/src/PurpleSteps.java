import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {
    int repeat = WIDTH/10;
    int x = 0;
    int y = 0;
    while (repeat > 0) {
      repeat = repeat - 1;
      x = x + 10;
      y = y + 10;
      squareDrawer(graphics,x,y);
    }
  }
  private static void squareDrawer(Graphics g, int x, int y) {
    g.setColor(new Color(176,78,240));
    g.fillRect(x,y,10,10);
    g.setColor(Color.black);
    g.drawRect(x,y,10,10);
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