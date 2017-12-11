import javax.swing.*;
    import java.awt.*;

    import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.black);
    int x = 300;
    int y = 300;
    fillRect(graphics, x, y, 300);
    fract(graphics, x, y, 1, 5);
  }

  private static void fillRect(Graphics g, int x, int y, int s) {
    g.fillRect(x,y,300 / s, 300 / s);
  }

  private static void fract(Graphics g, int x, int y, int s, int n) {
    if (n == 0) {
      return;
    } else {
      fillRect(g, x, y, s);
      int x1 =
      fract(g, x, y, s * 2, n - 1);
    }
  }


  static int WIDTH = 900;
  static int HEIGHT = 900;
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


