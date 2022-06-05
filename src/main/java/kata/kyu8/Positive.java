package kata.kyu8;

import java.util.Arrays;

public class Positive {
    public static int sum(int[] arr){
        int answer = 0;
        for (int value : arr) {
            if(value > 0) answer += value;
        }
        return answer;
    }

    public static int sum_best(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }
}
