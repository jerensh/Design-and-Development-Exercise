package exercise.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HouseHoldDatabase extends Base {

    /**
     * database of households
     *
     * @return all houseHolds
     */
    @Override
    public List<HouseHold> listOfHouseholds() {
        List<HouseHold> houseHolds = new ArrayList<>();
        houseHolds.add(new HouseHold());
        houseHolds.add(new HouseHold());
        houseHolds.add(new HouseHold("Dave", "Smith", "123 main st.", "seattle", "wa", "43"));
        houseHolds.add(new HouseHold("Alice", "Smith", "123 Main St.", "Seattle", "WA", "45"));
        houseHolds.add(new HouseHold("Bob", "Williams", "234 2nd Ave.", "Tacoma", "WA", "26"));
        houseHolds.add(new HouseHold("Carol", "Johnson", "234 2nd Ave", "Seattle", "WA", "67"));
        houseHolds.add(new HouseHold("Eve", "Smith", "234 2nd Ave.", "Tacoma", "WA", "25"));
        houseHolds.add(new HouseHold("Frank", "Jones", "234 2nd Ave.", "Tacoma", "FL", "23"));
        houseHolds.add(new HouseHold("George", "Brown", "345 3rd Blvd., Apt. 200", "Seattle", "WA", "18"));
        houseHolds.add(new HouseHold("Helen", "Brown", "345 3rd Blvd. Apt. 200", "Seattle", "WA", "18"));
        houseHolds.add(new HouseHold("Ian", "Smith", "123 main st ", "Seattle", "Wa", "18"));
        houseHolds.add(new HouseHold("Jane", "Smith", "123 Main St.", "Seattle", "WA", "13"));

        return houseHolds;
    }

    /**
     * gets and returns households older than 18
     *
     * @return households older than 18
     */

    public List<HouseHold> getHouseHoldsOlderThan18() {

        List<HouseHold> houseHolds = listOfHouseholds();
        List<HouseHold> houseHoldsOlderThan18 = new ArrayList<>();

        Collections.sort(houseHolds, new LastThenFirstComparator());

        /**
         *  Null values are handled as well
         */
        for (int i = 0; i < houseHolds.size(); i++) {
            Integer ageLimit = 18;
            if (houseHolds.get(i).getAge() != null) {
                if (Integer.parseInt(houseHolds.get(i).getAge()) > ageLimit) {
                    houseHoldsOlderThan18.add(houseHolds.get(i));
                }
            }
        }
        return houseHoldsOlderThan18;
    }
}
