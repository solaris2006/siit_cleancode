package org.cleancode.notes.v2.ocp;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(97, 98, 99, 100, 101);
        System.out.println(convert(integerList, new DoubleMapper()));
        System.out.println(convert(integerList, new BigDecimalMapper()));
        System.out.println(convert(integerList, new CharacterMapper()));
//        System.out.println(convertJava8(integerList, val -> Double.valueOf(val.toString())));
//        System.out.println(convertJava8(integerList, val-> BigDecimal.valueOf(val).divide(BigDecimal.valueOf(3), MathContext.DECIMAL64)));

    }

    private static <T> List<T> convert(List<Integer> integerList, NumberMapper<T> mapper) {
        List<T> doubles = new ArrayList<>();
        for (Integer integer : integerList) {
            doubles.add(mapper.map(integer));
        }

        return doubles;
    }

    private static <T> List<T> convertJava8(List<Integer> integerList, Function<Integer, T> mapper) {
        List<T> doubles = new ArrayList<>();
        for (Integer integer : integerList) {
            doubles.add(mapper.apply(integer));
        }

        return doubles;
    }


}
