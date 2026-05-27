package org.example.arge;

public class HybridCar extends CarSkeleton{

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " -> Hybrid system starting. Smart switching between Gas (" + cylinders + " cyl) and Electric (" + batterySize + " kWh) is ready.");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " -> Driving in smart eco hybrid mode.");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(getName() + " -> Hybrid controller is managing both internal combustion and electric motor.");
    }
}
