package com.vehicle;

public class Motorcycle extends Vehicle{
    private MotorcycleType type;

    public Motorcycle() {
        this.maxSpeed = 100;
        this.maxFuel = 5;
        this.type = MotorcycleType.MATIC;
    }

    public Motorcycle(int maxFuel, int maxSpeed,  MotorcycleType type) {
        this.maxSpeed = maxSpeed;
        this.maxFuel = maxFuel;
        this.type = type;
    }

    public MotorcycleType getType() {
        return type;
    }

    public void setType(MotorcycleType type) {
        this.type = type;
    }

    @Override
    public void getSpec() {
        System.out.println("Max Fuel  : "+this.maxFuel);
        System.out.println("Max Speed : "+this.maxSpeed);
        System.out.println("Type      : "+this.type);
    }
}
