public class Plant {
  private String name;
  private String color;
  private Double waterLevel;
  private Boolean needsWater;

  public Plant(String name, String color, Double waterLevel, Boolean needsWater) {
    this.name = name;
    this.color = color;
    this.waterLevel = waterLevel;
    this.needsWater = needsWater;
  }

  public Plant() {
    this.name = "Plant";
    this.color = "Green";
    this.waterLevel = null;
    this.needsWater = true;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Double getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(Double waterLevel) {
    this.waterLevel = waterLevel;
  }

  public Boolean getNeedsWater() {
    return needsWater;
  }

  public void setNeedsWater(Boolean needsWater) {
    this.needsWater = needsWater;
  }
  public void checkWater() {
    if (getWaterLevel() < 10){
      setNeedsWater(true);
    } else {
      setNeedsWater(false);
    }
  }
}
