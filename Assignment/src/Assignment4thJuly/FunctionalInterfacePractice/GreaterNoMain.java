package Assignment4thJuly.FunctionalInterfacePractice;

import java.util.function.Function;
import java.util.function.Predicate;

public class GreaterNoMain {

    public static void main(String[] args) {

        Predicate<Integer> greaterNoPredicate = (n) -> n>10;
        System.out.println("Test Predicate: " + greaterNoPredicate.test(8));
        Function<String,Integer> stringIntegerFunction = (T) -> T.length();
        System.out.println("Apply Function: " + stringIntegerFunction.apply("Navjot"));
        stringIntegerFunction.andThen()

    }
}
