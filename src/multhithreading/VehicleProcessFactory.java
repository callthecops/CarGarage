package multhithreading;

import model.Vehicle;

public class VehicleProcessFactory implements Runnable {

    private Vehicle vehicle;


    public VehicleProcessFactory(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void run() {

    }
}
