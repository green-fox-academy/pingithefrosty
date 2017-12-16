public class Main {

  public static void main(String[] args) {
    Station station1 = new Station();
    Car car1 = new Car();
    System.out.println(station1.getStationGas());
    System.out.println(car1.getCarGas() + "\n");
    station1.refill(car1);
    System.out.println(station1.getStationGas());
    System.out.println(car1.getCarGas());
  }
}
