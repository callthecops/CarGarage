package model.twoWheeler.tires;

import model.genericTire.Tire;

public class ScooterTire extends Tire implements TwoWheeler {

    private Enum<TwoWheelerTireTypes> type;


    public ScooterTire(String description, String brand) {
        this.description = description;
        this.brand = brand;
        this.type = TwoWheelerTireTypes.SCOOTER;
    }


    public Enum<TwoWheelerTireTypes> getType() {
        return type;
    }


}

