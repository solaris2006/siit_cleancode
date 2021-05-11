package org.cleancode;

import java.util.Iterator;
import java.util.List;

public class SearchEngine {
    public List<CarModel> filterCarModels(CarSearchCriteria criteria, List<CarModel> carModels) {
        Iterator<CarModel> carModelIterator = carModels.listIterator();
        while (carModelIterator.hasNext()) {
            CarModel currentCarModel = carModelIterator.next();
            if (!MathUtil.intervalsIntersect(criteria.getYearInterval().getStart(), criteria.getYearInterval().getEnd(),
                    currentCarModel.getYearInterval().getStart(), currentCarModel.getYearInterval().getEnd())) {
                carModelIterator.remove();
            }
        }
        return carModels;
    }
}

class MathUtil {
    public static boolean intervalsIntersect(int start1, int end1, int start2, int end2) {
        return start1 <= end2 && start2 <= end1;
    }
}

