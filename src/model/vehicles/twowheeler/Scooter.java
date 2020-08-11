package model.vehicles.twowheeler;

public class Scooter implements TwoWheeler {

    @Override
    public void startEngine() {
        System.out.println("Scooter started the engine ");
    }

    @Override
    public void ride() {
        System.out.println("Ride the scooter inside the garaje!");
    }
}
