import java.util.List;

public class Tile extends GameObject{
  private Boolean isFloor;
  private List charsOnTile;
  private static final String wall = "wall.png";
  private static final String floor = "floor.png";

  public Tile(int x, int y, Boolean isFloor, List charsOnTile) {
    this.x = x;
    this.y = y;
    this.isFloor = isFloor;
    if (isFloor) {
      setImage(floor);
    } else {
      setImage(wall);
    }
    this.charsOnTile = charsOnTile;
  }

  public Boolean getFloor() {
    return isFloor;
  }

  public List getCharsOnTile() {
    return charsOnTile;
  }

  public void setCharsOnTile(List charsOnTile) {
    this.charsOnTile = charsOnTile;
  }
// tile.enter(hero)
// tile.leave(hero)
  public void enter(Character character) {

  }

  public void leave(Character character) {
  }
}