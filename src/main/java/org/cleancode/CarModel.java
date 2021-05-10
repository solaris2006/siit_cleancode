package org.cleancode;

import java.util.Objects;

public class CarModel {
    private String make;
    private String model;
    private int startYear;
    private int endYear;

    public CarModel(String make, String model, int startYear, int endYear) {
        this.make = make;
        this.model = model;
        this.startYear = startYear;
        this.endYear = endYear;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarModel carModel = (CarModel) o;
        return startYear == carModel.startYear && endYear == carModel.endYear && Objects.equals(make, carModel.make) && Objects.equals(model, carModel.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, startYear, endYear);
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", startYear=" + startYear +
                ", endYear=" + endYear +
                '}';
    }
}
