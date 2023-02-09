import java.util.Arrays;

public class Array_ex2 {
    public static void main(String[] args) {
        int[] score = {100, 70, 82, 94, 64};

        int min = score[0];
        int max = score[0];

        for (int i : score) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("최소값: " + min);
        System.out.println("최대값: " + max);
    }
}
