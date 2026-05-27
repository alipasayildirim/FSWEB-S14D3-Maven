package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;


    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " -> Electric system initialized silently. Battery status check: " + batterySize + " kWh.");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " -> Driving silently on electricity. Range per charge: " + avgKmPerCharge + " km.");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(getName() + " -> Electric motor is spinning with high torque.");
    }
}
