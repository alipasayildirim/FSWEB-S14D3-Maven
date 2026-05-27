package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("------------------------------------");

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println("------------------------------------");


        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println("------------------------------------");


        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        CarSkeleton genericCar = new CarSkeleton("Generic Model", "Basic Prototype");
        genericCar.startEngine();
        genericCar.drive();
        System.out.println("------------------------------------");

        CarSkeleton gasCar = new GasPoweredCar("Mustang GT", "V8 Muscle", 7.5, 8);
        gasCar.startEngine();
        gasCar.drive();
        System.out.println("------------------------------------");

        CarSkeleton electricCar = new ElectricCar("Tesla Model S", "Dual Motor", 450.0, 100);
        electricCar.startEngine();
        electricCar.drive();
        System.out.println("------------------------------------");


        CarSkeleton hybridCar = new HybridCar("Toyota Prius", "Eco Friendly Hybrid Sedan", 3.8, 45, 4);
        hybridCar.startEngine();
        hybridCar.drive();

    }
}