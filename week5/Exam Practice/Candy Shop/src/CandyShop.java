import java.util.ArrayList;

public class CandyShop {
  static final Candy CANDY = new Candy();
  static final Lollipop LOLLIPOP = new Lollipop();
  private double income;
  private int sugar;
  private float raisePercent;

  public float getRaisePercent() {
    return raisePercent;
  }

  public void setRaisePercent(float raisePercent) {
    this.raisePercent = raisePercent;
  }

  ArrayList<Candy> candyList;
  ArrayList<Lollipop> lollipopList;

  public CandyShop(int sugar) {
    this.sugar = sugar;
    candyList = new ArrayList<>();
    lollipopList = new ArrayList<>();
    raisePercent = 1;
  }

  public void createSweets(Sweets type) {
    if (type instanceof Candy) {
      Candy candy = new Candy();
      sugar -= candy.getSugar();
      candyList.add(candy);
    } else if (type instanceof Lollipop) {
      Lollipop lollipop = new Lollipop();
      sugar -= lollipop.getSugar();
      lollipopList.add(lollipop);
    } else {
      System.out.println("Sorry, but that is not available in the Candy Shop");
    }
  }

  public void raise(int percentage) {
    setRaisePercent(getRaisePercent() + (percentage / 100));
  }

  public void sell(Lollipop lollipop, int amount) {
    income = income + amount * lollipop.getPrice() * raisePercent;
    for (int i = 0; i < amount; i++) {
      lollipopList.remove(lollipopList.get(i));
    }
  }

  public void sell(Candy candy, int amount) {
    income = income + amount * candy.getPrice() * raisePercent;
    for (int i = 0; i < amount; i++) {
      candyList.remove(candyList.get(i));
    }
  }

  public void buySugar (int amount) {
    income = income - amount / 10;
    sugar = sugar + amount;
  }

  @Override
  public String toString() {
    String status ="Inventory: " + candyList.size() +
        " candies, " + lollipopList.size() +
        " lollipops, Income: " + income +
        "$, Sugar: " + sugar + "gr" + raisePercent;
    return status;
  }

  public double getIncome() {
    return income;
  }

  public void setIncome(double income) {
    this.income = income;
  }

  public int getSugar() {
    return sugar;
  }

  public void setSugar(int sugar) {
    this.sugar = sugar;
  }
}
