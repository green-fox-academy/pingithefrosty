import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    int r = 0;
    int g = 0;
    int b = 0;
    int x = WIDTH;
    while (x > 0) {
      r = (int)(Math.random()*255);
      g = (int)(Math.random()*255);
      b = (int)(Math.random()*255);
      x = x - 10;
      squareDrawer(graphics,x,new Color(r,g,b));
    }
  }
  private static void squareDrawer(Graphics g, int x, Color col) {
    g.setColor(col);
    g.fillRect((WIDTH-x)/2,(HEIGHT-x)/2,x,x);
  }
  // create a square drawing function that takes 2 parameters:
  // the square size, and the fill color,
  // and draws a square of that size and color to the center of the canvas.
  // create a loop that fills the canvas with rainbow colored squares.
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