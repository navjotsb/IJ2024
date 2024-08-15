package Assignment4thJuly.FunctionalInterfacePractice;

import java.util.function.*;

public class GreaterNoMain {

    public static void main(String[] args) {

        Predicate<Integer> greaterNoPredicate = (n) -> n>10;
        System.out.println("Test Predicate: " + greaterNoPredicate.test(8));
        Function<String,Integer> stringIntegerFunction = (T) -> T.length();
        System.out.println("Apply Function: " + stringIntegerFunction.apply("Navjot"));
        Function<Integer,Integer> adthnCheck = (S) -> S*2;
        Function<String,Integer> combineCheck =  stringIntegerFunction.andThen(adthnCheck);
        System.out.println("addthen Function: " +combineCheck.apply("Navjot"));
        Consumer<String> upper = (T)-> System.out.println("accept Consumer: " + T.toUpperCase());
        upper.accept("navjot");
        BiFunction<Double,Double,Double> addCheck = (a,b)-> a+b;
        System.out.println("apply BiFunction: " + addCheck.apply(10.0, 5.0));
        Supplier<Double> randomNumberSupplier = () -> Math.random();
        System.out.println("get Supplier: " + randomNumberSupplier.get());

    }
}
