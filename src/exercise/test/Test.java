package exercise.test;

import exercise.util.HouseHoldDatabase;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        HouseHoldDatabase houseHoldDatabase = new HouseHoldDatabase();

        Iterator it = houseHoldDatabase.getHouseHoldsOlderThan18().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
