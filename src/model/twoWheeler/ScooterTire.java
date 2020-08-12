package model.twoWheeler;

public class ScooterTire extends Tire implements TwoWheeler {

    private Enum<TwoWheelerTireTypes> type;

    public void changeTwoTires() {
        System.out.println("Scooter Tires have been Changed");
    }

    public ScooterTire(String description, String brand) {
        this.description = description;
        this.brand = brand;
        this.type = TwoWheelerTireTypes.SCOOTER;
    }


    public Enum<TwoWheelerTireTypes> getType() {
        return type;
    }

    public void setType(Enum<TwoWheelerTireTypes> type) {
        this.type = type;
    }
}

