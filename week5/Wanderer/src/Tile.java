import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Tile {
  private BufferedImage image;
  private int posX, posY;
  private Boolean isFloor;

  public BufferedImage getImage() {
    return image;
  }

  public void setImage(BufferedImage image) {
    this.image = image;
  }

  public Tile (String filename, int posX, int posY, boolean isFloor) {
    this.posX = posX;
    this.posY = posY;
    this.isFloor = true;
    try {
      if (Objects.equals(filename, "wall")) {
        image = ImageIO.read(new File("wall.png"));
      } else if (Objects.equals(filename, "floor")){
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