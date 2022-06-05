package kata.kyu8;

public class Multiply {

    public static Double multiply(Double a, Double b) {
        return a * b;
    }

    public static Double multiply_best(Double a, Double b) {
        return (a == null || b == null) ? null : a * b;
    }
}