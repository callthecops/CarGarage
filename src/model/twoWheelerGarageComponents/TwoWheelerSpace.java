package model.twoWheelerGarageComponents;

public class TwoWheelerSpace<T> {
    private TwoWheelerRack<T> twoWheelerRack = new TwoWheelerRack<>();


    public TwoWheelerRack<T> getTwoWheelerRack() {
        return twoWheelerRack;
    }

    public void setTwoWheelerRack(TwoWheelerRack<T> twoWheelerRack) {
        this.twoWheelerRack = twoWheelerRack;
    }
}
