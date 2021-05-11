package org.cleancode;

public class CarSearchCriteria {
    private final YearInterval yearInterval;
    private final String make;

    public CarSearchCriteria(YearInterval yearInterval, String make) {
        this.yearInterval = yearInterval;
        this.make = make;
    }

    public YearInterval getYearInterval() {
        return yearInterval;
    }

    public String getMake() {
        return make;
    }
}
