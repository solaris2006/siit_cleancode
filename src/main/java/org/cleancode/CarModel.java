package org.cleancode;

public class CarModel {
    private final String make;
    private final String model;
    private final YearInterval yearInterval;

    public CarModel(String make, String model, YearInterval yearInterval) {
        this.make = make;
        this.model = model;

        this.yearInterval = yearInterval;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public YearInterval getYearInterval() {
        return yearInterval;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", yearInterval=" + yearInterval +
                '}';
    }
}
