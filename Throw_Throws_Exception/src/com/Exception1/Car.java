package com.Exception1;

public class Car {

    private boolean engineStarted;
    private double fuelLevel;

    public Car(double fuelLevel) {
        this.engineStarted = false;
        this.fuelLevel = fuelLevel;
    }

    public void startEngine() throws LowFuelException {
        if (fuelLevel <= 0) {
            throw new LowFuelException("Cannot start Engine. Low Fuel level.");
        }
        System.out.println("Engine started successfully.");
        System.out.println();
        engineStarted = true;
    }

    public void accelerate() throws LowFuelException {
        if (!engineStarted) {
            throw new IllegalStateException("Cannot accelerate. Engine not started.");
        }
        if (fuelLevel <= 0) {
            throw new LowFuelException("Cannot accelerate. Low fuel level.");
        }
        System.out.println("Car is accelerating.");
        fuelLevel -= 0.1;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
    
    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

}
