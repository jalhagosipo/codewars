package kata.kyu8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.abs;

public class Kata {
    public static int makeNegative(final int x) {
        return (x > 0) ? -1 * x : x;
    }

    public static int makeNegative_best(final int x) {
        return -abs(x);
    }

    public static int opposite(int number)
    {
        return -number;
    }

    public static String solution(String str) {
        char[] ary = str.toCharArray();
        char[] answer = new char[ary.length];

        for(int i = 0; i < ary.length; i++) {
            answer[i] = ary[ary.length - i - 1];
        }
        return String.valueOf(answer);
    }

    public static String solution_best(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    public static String numberToString_clever(int num) {
        return ""+num;
    }
}
