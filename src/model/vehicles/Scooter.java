package model.vehicles;

import model.Vehicle;
import model.twoWheeler.tires.ScooterTire;

public class Scooter implements Vehicle {
    ScooterTire scooterTire;

    @Override
    public void startEngine() {
        System.out.println("Starting the engine for the Scooter..");
    }

    @Override
    public void driveIn() {
        System.out.println("Driving the Scooter in the Garage");
    }

    @Override
    public void driveOut() {
        System.out.println("Driving the Scooter out of the Garage");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the engine for the Scooter..");
    }

    public ScooterTire getScooterTire() {
        return scooterTire;
    }

    public void setScooterTire(ScooterTire scooterTire) {
        this.scooterTire = scooterTire;
    }
}
