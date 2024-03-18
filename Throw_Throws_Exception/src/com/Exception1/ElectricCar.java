package com.Exception1;

public class ElectricCar extends Car {

    private int batteryLevel;

    public ElectricCar(double fuelLevel, int batteryLevel) {
        super(fuelLevel);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void accelerate() throws LowFuelException {
        if (getFuelLevel() <= 0 && batteryLevel <= 0) {
            throw new LowFuelException("Cannot accelerate. Low fuel level and battery level.");
        }
        if (getFuelLevel() <= 0) {
            throw new LowFuelException("Cannot accelerate. Low fuel level.");
        }
        if (batteryLevel <= 0) {
            System.out.println("Warning: Low battery level.");
        }
        System.out.println("Electric car is accelerating.");
        System.out.println();
        consumeFuelAndBattery();
    }

    private void consumeFuelAndBattery() {
        setFuelLevel(getFuelLevel() - 0.1);
        batteryLevel -= 10;
    }

    public void rechargeBattery(int amount) {
        batteryLevel += amount;
        if (batteryLevel > 100) {
            batteryLevel = 100;
        }
        System.out.println("Battery recharged. Current battery level: " + batteryLevel + "%");
        System.out.println();
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
