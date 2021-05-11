package org.cleancode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SearchEngine {
    public List<CarModel> filterCarModels2(CarSearchCriteria criteria, List<CarModel> carModels) {
        Iterator<CarModel> carModelIterator = carModels.listIterator();
        while (carModelIterator.hasNext()) {
            CarModel currentCarModel = carModelIterator.next();
            YearInterval carYearInterval = currentCarModel.getYearInterval();
            YearInterval criteriaYearInterval = criteria.getYearInterval();
            if (!carYearInterval.intersect(criteriaYearInterval)) {
                carModelIterator.remove();
            }
        }
        return carModels;
    }

    public List<CarModel> filterCarModels(CarSearchCriteria criteria, List<CarModel> carModels) {
        List<CarModel> filteredCarModels = new ArrayList<>();
        for (CarModel carModel : carModels) {
            if (carModel.getYearInterval().intersect(criteria.getYearInterval())) {
                filteredCarModels.add(carModel);
            }
        }

        return filteredCarModels;
    }

    public List<CarModel> filterCarModels3(CarSearchCriteria criteria, List<CarModel> carModels) {
        return carModels.stream()
                .filter(carModel -> carModel.getYearInterval().intersect(criteria.getYearInterval()))
                .collect(Collectors.toList());
    }
}

