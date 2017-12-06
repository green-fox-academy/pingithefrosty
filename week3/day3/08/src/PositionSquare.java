import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.green);
    graphics.drawRect(30, 30, 50, 60);
    graphics.setColor(Color.blue);
    graphics.drawRect(30, 100, 60, 70);
    graphics.setColor(Color.black);
    graphics.drawRect(100, 30, 30, 50);
    graphics.setColor(Color.red);
    graphics.drawRect(100, 100, 200, 150);
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