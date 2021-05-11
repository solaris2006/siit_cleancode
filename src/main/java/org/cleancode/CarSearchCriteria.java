package org.cleancode;

public class CarSearchCriteria {
    private final int startYear;
    private final int endYear;
    private final String make;

    public CarSearchCriteria(YearInterval yearInterval, String make) {
        this.startYear = yearInterval.getStart();
        this.endYear = yearInterval.getEnd();
        this.make = make;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public String getMake() {
        return make;
    }
}
