package model.fourWheeler.tires;

import model.genericTire.Tire;

public class CarTire extends Tire implements FourWheeler {

    private Enum<FourWheelerTireTypes> type;


    public CarTire(String description, String brand) {
        this.description = description;
        this.brand = brand;
        this.type = FourWheelerTireTypes.CAR;
    }


    public Enum<FourWheelerTireTypes> getType() {
        return type;
    }


}
