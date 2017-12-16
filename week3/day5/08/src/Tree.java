import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {
  public static void mainDraw(Graphics graphics){
    graphics.setColor(Color.black);
    graphics.fillRect(0,0,WIDTH,HEIGHT);
    graphics.setColor(Color.yellow);
    int x = 350;
    int y = 500;
    int s = 30;
    int a = 90;
    int a2 = 20;
    int n = 12;
    graphics.drawLine(x,y+s,x,y);
    tree(graphics,x,y,a,a2,s,n);
  }

  private static void tree(Graphics g, int x, int y, double a, int a2, int s, int n) {
    double x1 = x + (Math.cos(Math.toRadians(a-a2)) * s);
    double y1 = y - (Math.sin(Math.toRadians(a-a2)) * s);
    double x2 = x + (Math.cos(Math.toRadians(a+a2)) * s);
    double y2 = y - (Math.sin(Math.toRadians(a+a2)) * s);
    double x3 = x + (Math.cos(Math.toRadians(a)) * s);
    double y3 = y - (Math.sin(Math.toRadians(a)) * s);
    if (n == 0) {
      return;
    } else
    g.drawLine(x,y,(int)x3,(int)y3);
    g.drawLine(x,y,(int)x1,(int)y1);
    g.drawLine(x,y,(int)x2,(int)y2);

    tree(g,(int)x1,(int)y1,a-a2,a2,s,n-1);
    tree(g,(int)x3,(int)y3,a,a2,s,n-1);
    tree(g,(int)x2,(int)y2,a+a2,a2,s,n-1);
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