import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
  public static void mainDraw(Graphics graphics) {
    int[][] array1 = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
    int[][] array2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
    dotConnecter(graphics, array1);
    dotConnecter(graphics, array2);
  }

  private static void dotConnecter(Graphics g, int [][] dots) {
    g.setColor(Color.green);
    for (int i = 0; i < dots.length -1; i++) {
      g.drawLine(dots[i][0],dots[i][1],dots[i+1][0],dots[i+1][1]);
    }
    g.drawLine(dots[0][0],dots[0][1],dots[dots.length-1][0],dots[dots.length-1][1]);
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