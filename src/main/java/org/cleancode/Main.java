package org.cleancode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CarSearchCriteria criteria = new CarSearchCriteria(new YearInterval(2014, 2016), "Ford");
        CarModel fordFocusMk2 = new CarModel("Ford", "Focus", new YearInterval(2012, 2016));
        CarModel opelAstra = new CarModel("Opel", "Astra", new YearInterval(2010, 2013));
        List<CarModel> carModels = new ArrayList<>();
        carModels.add(fordFocusMk2);
        carModels.add(opelAstra);
        List<CarModel> models = new SearchEngine().filterCarModels(criteria, carModels);

        System.out.println(models);
    }
}
