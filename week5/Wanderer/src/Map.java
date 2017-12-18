import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Map extends JComponent  {
  static Map map;


  public List<String> maze() {
    Path path = Paths.get("maze.txt");
    List<String> layout = null;
    try {
      layout = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return layout;
  }

  public void build() {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (maze().get(j).charAt(i) == '0') {
          Tile floor = new Tile ("floor", i*100, j*100, true);
        } else {
          Tile wall = new Tile ("wall", i*100, j*100, false);
        }
      }
    }
  }


  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    graphics.fillRect(0, 0, 1000, 1000);
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (maze().get(j).charAt(i) == '0') {
          Tile floor = new Tile ("floor", i*100, j*100, true);
          floor.draw(graphics);
        } else {
          Tile wall = new Tile ("wall", i*100, j*100, false);
          wall.draw(graphics);
        }
      }
    }
  }

  public Tile getTile (int x, int y) {

    return null;
  }
}
