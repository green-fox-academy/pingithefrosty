public class Station {
  private int stationGas;

  public Station (){
    this.stationGas = 1000;
  }

  public int getStationGas() {
    return stationGas;
  }

  public void setStationGas (int stationGas) {
    this.stationGas = stationGas;
  }

  public void refill(Car car){
    this.stationGas = stationGas - (car.getCapacity()-car.getCarGas());
    car.setCarGas(car.getCapacity());
  }
}
/*
Station
gasAmount
refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
 */