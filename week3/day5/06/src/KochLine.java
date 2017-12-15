import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class KochLine {
  public static void mainDraw(Graphics graphics){
    graphics.setColor(Color.white);
    graphics.fillRect(0,0,WIDTH,HEIGHT);
    graphics.setColor(Color.black);
    int x = 50;
    int y = 350;
    kochLine(graphics,x,y,15,600,5);
  }

  private static void kochLine(Graphics g, int x, int y, double angle, int s, int n) {
      double x1 = x + (Math.cos(Math.toRadians(angle)) * s / 3);
      double y1 = y + (Math.sin(Math.toRadians(angle)) * s / 3);
      double x2 = x + (Math.cos(Math.toRadians(angle - 30)) * Math.sin(Math.toRadians(60)) * 2 * s / 3);
      double y2 = y + (Math.sin(Math.toRadians(angle - 30)) * Math.sin(Math.toRadians(60)) * 2 * s / 3);
      double x3 = x + (Math.cos(Math.toRadians(angle)) * 2 * s / 3);
      double y3 = y + (Math.sin(Math.toRadians(angle)) * 2 * s / 3);
      double x4 = x + (Math.cos(Math.toRadians(angle)) * s);
      double y4 = y + (Math.sin(Math.toRadians(angle)) * s);
      if (n == 0) {
        g.drawLine(x,y,(int)x1,(int)y1);
        g.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
        g.drawLine((int)x2,(int)y2,(int)x3,(int)y3);
        g.drawLine((int)x3,(int)y3,(int)x4,(int)y4);
        return;
      } else
      kochLine(g, x, y, angle, s / 3, n - 1);
      kochLine(g, (int)x1, (int)y1, angle - 60, s / 3, n - 1);
      kochLine(g, (int)x2, (int)y2, angle + 60, s / 3, n - 1);
      kochLine(g, (int)x3, (int)y3, angle,  s / 3, n - 1);
  }

  static int WIDTH = 700;
  static int HEIGHT = 700;

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