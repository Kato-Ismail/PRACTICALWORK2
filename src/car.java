public class car {
    private double speedKph;
    private float fuelLevel;
    private int distanceTravelled;

    public void setSpeed(double speed)
    {
    this.speedKph = speed;
    }
    public void setFuelLevel(float fuel)
    {
        this.fuelLevel = fuel;
    }
    public void drive(int distance)
    {
        distanceTravelled = distance;
    }
     public double getSpeedMph()
     {
         return speedKph;
     }
     public int getDistanceKm()
     {
         return distanceTravelled;
     }
     public int calculateRemainingFuel(double distance)
     {
         double fuelConsumed = distance*0.5;
         return (int) fuelConsumed;
     }
}
