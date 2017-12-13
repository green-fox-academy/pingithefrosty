public class Tree extends Plant {
  private Double absorb;

  public Tree(String name, String color, Double waterLevel, Boolean needsWater, Double absorb) {
    super(name, color, waterLevel, needsWater);
    this.absorb = 0.4;
  }

  public Tree(String color) {
    this.absorb = 0.4;
    this.setWaterLevel(0.0);
    this.setNeedsWater(true);
    this.setColor(color);
  }

  public Double getAbsorb() {
    return absorb;
  }

  public void setAbsorb(Double absorb) {
    this.absorb = absorb;
  }

  public void checkWater() {
    if (getWaterLevel() < 10){
      setNeedsWater(true);
    } else {
      setNeedsWater(false);
    }
  }
}