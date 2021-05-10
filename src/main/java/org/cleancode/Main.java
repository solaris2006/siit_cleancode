package org.cleancode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CarSearchCriteria criteria = new CarSearchCriteria(201, 202, "Ford");
        CarModel fordFocusMk2 = new CarModel("Ford", "Focus", 2012, 2016);
        CarModel opelAstra = new CarModel("Opel", "Astra", 2010, 2013);
        List<CarModel> carModels = new ArrayList<>();
        carModels.add(fordFocusMk2);
        carModels.add(opelAstra);
        List<CarModel> models = new SearchEngine().filterCarModels(criteria, carModels);

        System.out.println(models);
    }
}
