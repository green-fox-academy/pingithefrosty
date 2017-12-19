import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Map extends JComponent  {
  private Tile[][] map = new Tile[10][10];
  private List<String> layout;

  public Map() {
    layout = new ArrayList<>();
    Tile wall = new Tile("wall");
    Tile floor = new Tile("floor");
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (maze().get(j).charAt(i) == '0') {
          map[i][j] = floor;
        } else if (maze().get(j).charAt(i) == '1') {
          map[i][j] = wall;
        }
      }
    }
  }

  public List<String> maze() {
    Path path = Paths.get("maze.txt");
    try {
      layout = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return layout;
  }

  public Tile getTile (int x, int y) {
    //if (x < 0 || x > 10 || y < 0 || y > 10) {
      return map[x][y];
    }
  }
