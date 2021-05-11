package org.cleancode;

public class CarModel {
    private final String make;
    private final String model;
    private final int startYear;
    private final int endYear;

    public CarModel(String make, String model, YearInterval yearInterval) {
        this.make = make;
        this.model = model;

        this.startYear = yearInterval.getStart();
        this.endYear = yearInterval.getEnd();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

}
