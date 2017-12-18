import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Hero extends Character {
  int x;
  int y;
  BufferedImage image;

  public void setImage(BufferedImage image) {
    this.image = image;
  }

  enum Directions {
    UP, DOWN, LEFT, RIGHT
  }

  public Hero() {
    x = 0;
    y = 0;
    try {
      image = ImageIO.read(new File("hero-down.png"));
      } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void draw (Graphics graphics) {
    if (image != null) {
      Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
      graphics.drawImage(scaledImage, x, y, null);
    }
  }

  public void move(Directions dir) {
    int newX = x;
    int newY = y;

    switch (dir) {
      case UP:
        newY = y - 100;
        try {
          setImage(ImageIO.read(new File("hero-up.png")));
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;
      case DOWN:
        newY = y + 100;
        try {
          setImage(ImageIO.read(new File("hero-down.png")));
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;
      case LEFT:
        newX = x - 100;
        try {
          setImage(ImageIO.read(new File("hero-left.png")));
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;
      case RIGHT:
        newX = x + 100;
        try {
          setImage(ImageIO.read(new File("hero-right.png")));
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;
    }
    if ((newX < 1000) && (newY < 1000) && (newX > -1) && (newY > -1) ) {
      x = newX;
      y = newY;
    }
  }
}