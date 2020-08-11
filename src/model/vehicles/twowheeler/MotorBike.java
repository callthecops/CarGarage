package model.vehicles.twowheeler;

public class MotorBike implements TwoWheeler {
    @Override
    public void startEngine() {
        System.out.println("Motor Bike has started the engine !");
    }

    @Override
    public void ride() {
        System.out.println("ride the bike inside the garage");
    }
}
