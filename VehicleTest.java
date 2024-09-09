public class VehicleTest {
    public static void main(String[]args)

    Car f = new Car();
    ElectricCar g = new ElectricCar();

    f.setSpeed(90);
    f.setFuelLevel(40f);
    g.setSpeed(80);
    g.setFuelLevel(90f);

    f.drive(50000);
    g.drive(50000);
    System.out.println("Car");
    System.out.println("Speed in mph"+f.getSpeedMph);
    System.out.println("Distance travelled in km"+f.getDistanceKm);
    System.out.println("Remaining battery"+f.calculateRemainingFuel);
    System.out.println("ElectricCar");
    System.out.println("Speed in mph"+g.getSpeedMph);
    System.out.println("Distance travelled in km"+g.getDistanceKm);
    System.out.println("Remaining fuel"+g.calculateRemainingFuel);
    System.out.println("Remaining battery"+g.getBatteryLevel);
}
