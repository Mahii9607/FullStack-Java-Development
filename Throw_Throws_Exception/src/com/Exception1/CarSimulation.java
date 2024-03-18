package com.Exception1;

public class CarSimulation {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar(0.5, 80);

        try {
            electricCar.startEngine();
            electricCar.accelerate();
            electricCar.rechargeBattery(20);
            electricCar.accelerate();
        } catch (LowFuelException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

