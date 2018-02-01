public class Cuboid {
  private int length;
  private int height;
  private int width;

  public Cuboid(int length, int height, int width) {
    this.length = length;
    this.height = height;
    this.width = width;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  //Returns the surface of the cuboid.
  public int getSurface() {
    return (2 * getLength() * getHeight()) + (2 * getLength() * getWidth()) + (2 * getWidth() * getHeight());
  }

  //Returns the volume of the cuboid.
  public int getVolume() {
    return getLength() * getHeight() * getWidth();
  }
}