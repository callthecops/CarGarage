package model.tires.fourwheeler;

import model.tires.Tire;

public class CarTires extends Tire implements FourWheeler {
    @Override
    public boolean fourTireChange() {
        return false;
    }
}
