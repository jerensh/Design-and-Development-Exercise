package exercise.util;

import java.util.Comparator;

public class LastThenFirstComparator implements Comparator<HouseHold> {

    /**
     * Null values are handled as well
     */
    @Override
    public int compare(HouseHold h1, HouseHold h2) {

        if (h1.getLastName() != null && h2.getLastName() != null) {
            if (h1.getLastName().equals(h2.getLastName())) {
                return h1.getFirstName().compareTo(h2.getFirstName());
            } else {
                return h1.getLastName().compareTo(h2.getLastName());
            }
        }
        return 0;
    }
}

