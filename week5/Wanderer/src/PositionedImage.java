import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PositionedImage {
  BufferedImage image;
  int posX, posY;
  boolean isFloor;


  public PositionedImage(String filename, int posX, int posY, boolean isFloor) {
    this.posX = posX;
    this.posY = posY;
    try {
      if (isFloor) {
        image = ImageIO.read(new File("wall.png"));
      } else {
        image = ImageIO.read(new File("floor.png"));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
      graphics.drawImage(scaledImage, posX, posY, null);
    }
  }
}