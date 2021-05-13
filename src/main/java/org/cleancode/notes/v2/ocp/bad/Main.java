package org.cleancode.notes.v2.ocp.bad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(97, 98, 99, 100, 101);
        System.out.println(convertToDouble(integerList));
    }

    private static List<Double> convertToDouble(List<Integer> integerList) {
        List<Double> doubles = new ArrayList<>();
        for (Integer integer: integerList){
            doubles.add(Double.valueOf(integer.toString()));
        }

        return doubles;
    }
}
