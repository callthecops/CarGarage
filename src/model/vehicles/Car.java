package model.vehicles;

import model.Vehicle;
import model.fourWheeler.tires.CarTire;

public class Car implements Vehicle {
    CarTire carTire;

    @Override
    public void startEngine() {
        System.out.println("Starting the engine for the Car..");
    }

    @Override
    public void driveIn() {
        System.out.println("Driving the Car in the Garage");
    }

    @Override
    public void driveOut() {
        System.out.println("Driving the Car out of the Garage");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the engine for the Car..");
    }


    public CarTire getCarTire() {
        return carTire;
    }

    public void setCarTire(CarTire carTire) {
        this.carTire = carTire;
    }
}
