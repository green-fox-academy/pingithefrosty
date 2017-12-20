import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Tile {
  private BufferedImage texture;
  private Boolean isFloor;
  private int x, y;

  public int getX() {
    return x;
  }


  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public Tile (String filename, int x, int y) {
    this.x = x;
    this.y = y;
    try {
      if (Objects.equals(filename, "wall")) {
        texture = ImageIO.read(new File("wall.png"));
        isFloor = false;
      } else if (Objects.equals(filename, "floor")){
        texture = ImageIO.read(new File("floor.png"));
        isFloor = true;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public BufferedImage getTexture() {
    return texture;
  }

  public void setTexture(BufferedImage texture) {
    this.texture = texture;
  }

  public Boolean getFloor() {
    return isFloor;
  }

  public void setFloor(Boolean floor) {
    isFloor = floor;
  }
}