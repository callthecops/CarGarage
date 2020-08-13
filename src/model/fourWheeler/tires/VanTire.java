package model.fourWheeler.tires;

import model.genericTire.Tire;

public class VanTire extends Tire implements FourWheeler {
    private Enum<FourWheelerTireTypes> type;


    public VanTire(String description, String brand) {
        this.description = description;
        this.brand = brand;
        this.type = FourWheelerTireTypes.VAN;
    }


    public Enum<FourWheelerTireTypes> getType() {
        return type;
    }
}
