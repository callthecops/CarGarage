package model.twoWheeler.tires;

import model.genericTire.Tire;

public class MotorBikeTire extends Tire implements TwoWheeler {

    private Enum<TwoWheelerTireTypes> type;


    public MotorBikeTire(String description, String brand) {
        this.description = description;
        this.brand = brand;
        this.type = TwoWheelerTireTypes.MOTORBIKE;
    }

    public Enum<TwoWheelerTireTypes> getType() {
        return type;
    }


}
