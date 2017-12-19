import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Map extends JComponent  {
  private Tile[][] map = new Tile[10][10];
  private List<String> layout;
  private ArrayList<Tile> floorList = new ArrayList<>();

  public Map() {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (maze().get(j).charAt(i) == '0') {
          Tile floor = new Tile("floor",i,j);
          map[i][j] = floor;
        } else if (maze().get(j).charAt(i) == '1') {
          Tile wall = new Tile("wall",i,j);
          map[i][j] = wall;
        }
      }
    }
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (getTile(i,j).getFloor()) {
          floorList.add(getTile(i,j));
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
      return map[x][y];
  }

  public ArrayList<Tile> getFloorList() {
    return floorList;
  }
/*
  public Tile getRandomFloorTile () {
    ArrayList<Tile> floorList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (getTile(i,j).getFloor()) {
          floorList.add(getTile(i,j));
        }
      }
    }
    int random = (int) (Math.random() * floorList.size());
    return floorList.get(random);
  }
  */
}
