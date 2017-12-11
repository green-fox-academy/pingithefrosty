public class Station {
  int gasAmount;
  int remainingAmount;

  public Station (){
    this.gasAmount = 1000;
  }

  public void refill(Car car){
    this.gasAmount = gasAmount - car.capacity;
    car.gasAmout += gasAmount;
  }
}
/*
Station
gasAmount
refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
 */