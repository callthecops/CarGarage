package model;

import model.twoWheelerGarageComponents.TwoWheelerSpace;

public class Garage<T> {
    private TwoWheelerSpace<T> tTwoWheelerSpace = new TwoWheelerSpace<>();
    //FourWheelerSpace<R> fourWheelerSpace = new FourWheelerSpace<>();


    public TwoWheelerSpace<T> gettTwoWheelerSpace() {
        return tTwoWheelerSpace;
    }

    public void settTwoWheelerSpace(TwoWheelerSpace<T> tTwoWheelerSpace) {
        this.tTwoWheelerSpace = tTwoWheelerSpace;
    }
}
