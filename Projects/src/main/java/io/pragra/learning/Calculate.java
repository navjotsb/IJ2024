package io.pragra.learning;


import java.util.function.BiFunction;
public class Calculate {

    private static double calculate(double a, double b, Operation operation) {
        return operation.apply(a, b);
    }
}
}
