import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
  public static void mainDraw(Graphics graphics) {
    int repeat = 6;
    int x = 0;
    int y = 0;
    int s = 10;
    while (repeat > 0) {
      repeat = repeat - 1;
      x = x + s;
      y = y + s;
      s = s + 10;
      squareDrawer(graphics,x,y,s);
    }
  }
  private static void squareDrawer(Graphics g, int x, int y, int s) {
    g.setColor(new Color(176,78,240));
    g.fillRect(x,y,s,s);
    g.setColor(Color.black);
    g.drawRect(x,y,s,s);
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