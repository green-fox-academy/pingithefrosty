import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void mainDraw(Graphics graphics){
    int color = (int)(Math.random()*255);
    graphics.setColor(new Color(color,color,color));
    graphics.fillRect(0,0,WIDTH,HEIGHT);
    int starCount = 400;
    int x = 0;
    int y = 0;
    graphics.setColor(Color.white);
    while (starCount > 0) {
      x = (int)(Math.random()*WIDTH);
      y = (int)(Math.random()*HEIGHT);
      graphics.fillRect(x,y,2,2);
      starCount = starCount - 1;
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