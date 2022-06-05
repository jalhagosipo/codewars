package kata.kyu8;

import static java.lang.Math.abs;

public class Kata {
    public static int makeNegative(final int x) {
        return (x > 0) ? -1 * x : x;
    }

    public static int makeNegative_best(final int x) {
        return -abs(x);
    }
}
