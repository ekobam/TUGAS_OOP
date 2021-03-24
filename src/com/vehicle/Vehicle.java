package com.vehicle;

public class Vehicle {
    protected int maxSpeed;
    protected int maxFuel;

    Vehicle(){
        maxFuel = 100;
        maxSpeed = 120;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(int maxFuel) {
        this.maxFuel = maxFuel;
    }

    public void getSpec(){

    }
}
