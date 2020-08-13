package model.vehicles;

import model.Vehicle;
import model.fourWheeler.tires.VanTire;

public class Van implements Vehicle {
    VanTire vanTire;

    @Override
    public void startEngine() {
        System.out.println("Starting the engine for the Van..");
    }

    @Override
    public void driveIn() {
        System.out.println("Driving the Van in the Garage");
    }

    @Override
    public void driveOut() {
        System.out.println("Driving the Van out of the Garage");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the engine for the Van..");
    }

    public VanTire getVanTire() {
        return vanTire;
    }

    public void setVanTire(VanTire vanTire) {
        this.vanTire = vanTire;
    }
}
