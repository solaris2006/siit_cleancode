package org.cleancode.notes.v2.ocp;

public class DoubleMapper implements NumberMapper<Double>{
    @Override
    public Double map(Integer integer) {
        return Double.valueOf(integer.toString());
    }
}
