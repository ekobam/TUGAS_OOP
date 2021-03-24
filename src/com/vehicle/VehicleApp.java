package com.vehicle;

public class VehicleApp {
    public static void main(String[] args) {
        Car defaultCar = new Car();
        Car brio = new Car(35, 160, 5);

        Motorcycle defaultMotor = new Motorcycle();
        Motorcycle aerox = new Motorcycle(5, 120, MotorcycleType.MATIC);

        System.out.println("Default Car");
        defaultCar.getSpec();
        System.out.println("---------------");

        System.out.println("Brio");
        brio.getSpec();
        System.out.println("---------------");

        System.out.println("Default Motorcycle");
        defaultMotor.getSpec();
        System.out.println("---------------");

        System.out.println("Aerox");
        aerox.getSpec();
        System.out.println("---------------");
    }
}
