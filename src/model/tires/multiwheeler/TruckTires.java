package model.tires.multiwheeler;

import model.tires.Tire;

public class TruckTires extends Tire implements MultiWheeler {
    @Override
    public boolean multiTireChange() {
        return false;
    }
}
