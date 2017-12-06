import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {
    for (int i = 0; i < WIDTH / 40; i++) {
      graphics.setColor(Color.pink);
      graphics.drawLine(i * 20, 0, WIDTH / 2, i * 20);
      graphics.setColor(Color.green);
      graphics.drawLine(0, i * 20, i * 20, WIDTH / 2);
    }
    for (int j = 0; j < WIDTH / 40; j++) {
      graphics.setColor(Color.pink);
      graphics.drawLine(WIDTH / 2 + j * 20, 0, WIDTH, j * 20);
      graphics.setColor(Color.green);
      graphics.drawLine(WIDTH / 2, j * 20, WIDTH / 2 + j * 20, WIDTH / 2);
    }
    for (int k = 0; k < WIDTH / 40; k++) {
      graphics.setColor(Color.pink);
      graphics.drawLine(WIDTH/2 + k * 20, WIDTH/2, WIDTH, WIDTH/2 + k * 20);
      graphics.setColor(Color.green);
      graphics.drawLine(0, WIDTH / 2 + k * 20, k * 20, WIDTH);
    }
    for (int k = 0; k < WIDTH / 40; k++) {
      graphics.setColor(Color.pink);
      graphics.drawLine(k * 20, WIDTH/2, WIDTH/2, WIDTH/2 + k * 20);
      graphics.setColor(Color.green);
      graphics.drawLine(WIDTH/2, WIDTH / 2 + k * 20, WIDTH/2 + k * 20, WIDTH);
    }
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