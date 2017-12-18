import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class PosIm {
  BufferedImage image;
  int posX, posY;
  Boolean isFloor;

  public PosIm (String filename, int posX, int posY, boolean isFloor) {
    this.posX = posX;
    this.posY = posY;
    this.isFloor = true;
    try {
      if (Objects.equals(filename, "wall")) {
        image = ImageIO.read(new File("wall.png"));
      } else if (Objects.equals(filename, "floor")){
        image = ImageIO.read(new File("floor.png"));
      } else if (Objects.equals(filename, "boss")) {
        image = ImageIO.read(new File("boss.png"));
      } else if (Objects.equals(filename, "skeleton")) {
        image = ImageIO.read(new File("skeleton.png"));
      } else if (Objects.equals(filename, "heroU")) {
        image = ImageIO.read(new File("hero-up.png"));
      } else if (Objects.equals(filename, "heroD")) {
        image = ImageIO.read(new File("hero-down.png"));
      } else if (Objects.equals(filename, "heroL")) {
        image = ImageIO.read(new File("hero-left.png"));
      } else if (Objects.equals(filename, "heroU")) {
        image = ImageIO.read(new File("hero-right.png"));
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