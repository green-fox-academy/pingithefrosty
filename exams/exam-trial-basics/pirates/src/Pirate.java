class Pirate {
  private String name;
  private boolean hasWoodenLeg;
  private int gold;

  Pirate(String name, boolean hasWoodenLeg, int gold) {
    this.name = name;
    this.hasWoodenLeg = hasWoodenLeg;
    this.gold = gold;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isHasWoodenLeg() {
    return hasWoodenLeg;
  }

  public void setHasWoodenLeg(boolean hasWoodenLeg) {
    this.hasWoodenLeg = hasWoodenLeg;
  }

  public int getGold() {
    return gold;
  }

  public void setGold(int gold) {
    this.gold = gold;
  }
}