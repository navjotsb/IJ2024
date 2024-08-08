package io.pragra.learning;


import java.util.function.BiFunction;
import java.util.function.Function;

public class Calculate {

    private static double calculate(double a, double b, Iadd Iadd) {
        return Iadd.add(a, b);
    }
}

