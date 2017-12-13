public class Flower extends Plant {
  private Double absorb;


  public Flower(String name, String color, Double waterLevel, Boolean needsWater, Double absorb) {
    super(name, color, waterLevel, needsWater);
    this.absorb = 0.75;
  }

  public Flower(String color) {
    this.absorb = 0.75;
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
    if (getWaterLevel() < 5){
      setNeedsWater(true);
    } else {
      setNeedsWater(false);
    }
  }
}