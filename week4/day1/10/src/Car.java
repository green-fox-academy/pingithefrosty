public class Car {
  private int carGas;
  private int capacity;

  public Car (){
    this.capacity = 100;
    this.carGas = 20;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getCarGas () {
    return carGas;
  }

  public void setCarGas (int gasAmout) {
    this.carGas = gasAmout;
  }
}
/*
Car
gasAmount
capacity
create constructor for Car where:
initialize gasAmount -> 0
initialize capacity -> 100
 */