package model.vehicles;

import model.Vehicle;
import model.twoWheeler.tires.MotorBikeTire;

public class MotorBike implements Vehicle {

    MotorBikeTire motorBikeTire;

    @Override
    public void startEngine() {
        System.out.println("Starting the engine for the MotorBike..");
    }

    @Override
    public void driveIn() {
        System.out.println("Driving the MotorBike in the Garage");
    }

    @Override
    public void driveOut() {
        System.out.println("Driving the MotorBike out of the Garage");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the engine for the MotorBike..");
    }


    public MotorBikeTire getMotorBikeTire() {
        return motorBikeTire;
    }

    public void setMotorBikeTire(MotorBikeTire motorBikeTire) {
        this.motorBikeTire = motorBikeTire;
    }
}
