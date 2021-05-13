package org.cleancode.notes.v1;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        System.out.println(f(null));

//        f2(null).toString();


        Map<Test, String> testStringMap = new HashMap<>();
        Test test = new Test();
        test.name = "23";
        testStringMap.put(test, "dasdasd");
        System.out.println(testStringMap.get(test));
        test.name = "24";
        System.out.println(testStringMap.get(test));

    }

    public static Integer f(Integer value) {
        Integer result = f1(value).orElse(0);
//        Integer result2 = f1(value).orElseThrow(IllegalArgumentException::new);
        return result + 10;
    }

    public static Optional<Integer> f1(Integer value) {

        return Optional.of(value);
    }

    public static Integer f2(Integer value) {

        return value;
    }


}
