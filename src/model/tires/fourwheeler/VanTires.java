package model.tires.fourwheeler;

import model.tires.Tire;

public class VanTires extends Tire implements FourWheeler {
    @Override
    public boolean fourTireChange() {
        return false;
    }
}
