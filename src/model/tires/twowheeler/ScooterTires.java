package model.tires.twowheeler;

import model.tires.Tire;

public class ScooterTires extends Tire implements TwoWheeler {
    @Override
    public boolean twoTireChange() {
        return false;
    }


}
