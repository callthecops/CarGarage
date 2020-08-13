package model.fourWheelerGarageComponents;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerRack<R> {

    private List<? super R> tireList;


    public FourWheelerRack() {
        this.tireList = new ArrayList<>();
    }


    public List<? super R> getTireList() {
        return tireList;
    }

    public void setTireList(List<? super R> tireList) {
        this.tireList = tireList;
    }

    public void checkRackTireQuantity() {
        System.out.println(tireList.size());
    }
}

