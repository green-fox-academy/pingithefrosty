import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar{
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.green);
    for (int i = 0; i < WIDTH / 40; i++) {
      graphics.drawLine(WIDTH/2, i * 20, WIDTH/2 - i * 20, WIDTH / 2);
      graphics.drawLine(WIDTH / 2, i * 20, WIDTH / 2 + i * 20, WIDTH / 2);
      graphics.drawLine(i * 20, WIDTH/2, WIDTH/2, WIDTH/2 + i * 20);
      graphics.drawLine(WIDTH/2 + i * 20, WIDTH/2, WIDTH/2, WIDTH - i * 20);
    }
    graphics.drawLine( WIDTH/2, WIDTH/2, WIDTH, WIDTH/2);
  }

  static int WIDTH = 480;
  static int HEIGHT = 480;
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