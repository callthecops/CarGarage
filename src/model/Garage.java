package model;

import model.twoWheelerGarageComponents.TwoWheelerSpace;
import model.fourWheelerGarageComponents.FourWheelerSpace;

public class Garage<T, R> {
    private TwoWheelerSpace<T> TwoWheelerSpace = new TwoWheelerSpace<>();

    private FourWheelerSpace<R> fourWheelerSpace = new FourWheelerSpace<>();


    public TwoWheelerSpace<T> getTwoWheelerSpace() {
        return TwoWheelerSpace;
    }

    public void setTwoWheelerSpace(TwoWheelerSpace<T> twoWheelerSpace) {
        this.TwoWheelerSpace = twoWheelerSpace;
    }

    public FourWheelerSpace<R> getFourWheelerSpace() {
        return fourWheelerSpace;
    }

    public void setFourWheelerSpace(FourWheelerSpace<R> fourWheelerSpace) {
        this.fourWheelerSpace = fourWheelerSpace;
    }
}
