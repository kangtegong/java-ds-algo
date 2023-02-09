import java.util.Arrays;

public class Array_ex1 {
    public static void main(String[] args) {
        int[] score = {100, 70, 82, 94, 64};
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        
        // ** for each를 이용한 
        // for (int i = 0; i < score.length; i++) {
        //     sum += score[i];
        // }
        
        double average = (double) sum / score.length;
        System.out.println("Score average: " + average);
    }
}
