package com.vehicle;

public class Car extends Vehicle {
    private final int seatCount;

    Car(){
        this.maxFuel = 200;
        this.maxSpeed = 200;
        this.seatCount = 4;
    }

    Car(int maxFuel, int maxSpeed, int seatCount){
        this.maxFuel = maxFuel;
        this.maxSpeed = maxSpeed;
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    @Override
    public void getSpec() {
        System.out.println("Max Fuel  : "+this.maxFuel);
        System.out.println("Max Speed : "+this.maxSpeed);
        System.out.println("Max Seat  : "+this.seatCount);
    }
}
