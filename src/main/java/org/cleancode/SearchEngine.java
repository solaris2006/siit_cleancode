package org.cleancode;

import java.util.Iterator;
import java.util.List;

public class SearchEngine {
    public List<CarModel> filterCarModels(CarSearchCriteria criteria, List<CarModel> carModels) {
        Iterator<CarModel> carModelIterator = carModels.listIterator();
        while (carModelIterator.hasNext()) {
            CarModel currentCarModel = carModelIterator.next();
            YearInterval carYearInterval = new YearInterval(criteria.getYearInterval().getStart(), criteria.getYearInterval().getEnd());
            YearInterval criteriaYearInterval = new YearInterval(currentCarModel.getYearInterval().getStart(), currentCarModel.getYearInterval().getEnd());
            if (!carYearInterval.intersect(criteriaYearInterval)) {
                carModelIterator.remove();
            }
        }
        return carModels;
    }
}

