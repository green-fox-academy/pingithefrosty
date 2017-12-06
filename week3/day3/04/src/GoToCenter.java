import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
  public static void mainDraw(Graphics graphics){
    Scanner scanner = new Scanner(System.in);
    int input1x = scanner.nextInt();
    int input1y = scanner.nextInt();
    int input2x = scanner.nextInt();
    int input2y = scanner.nextInt();
    int input3x = scanner.nextInt();
    int input3y = scanner.nextInt();
    graphics.setColor(Color.black);
    graphics.drawLine(input1x,input1y,WIDTH/2,HEIGHT/2);
    graphics.drawLine(input2x,input2y,WIDTH/2,HEIGHT/2);
    graphics.drawLine(input3x,input3y,WIDTH/2,HEIGHT/2);
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