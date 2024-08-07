package io.pragra.learning;

public interface Iadd {

    public Double add(Double num1, Double num2);

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
