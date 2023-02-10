import java.util.Arrays;

public class Sorting_5 {

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        bubbleSort(array);

        // print the sorted array
        // System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
             System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] array) {
        // variable to temporarily store an element during the swap process
        int temp = 0;
        // outer loop to repeat the swapping process n-1 times
        for(int i = 0; i < array.length - 1; i++) {
            // inner loop to compare and swap adjacent elements
            for(int j= 1 ; j < array.length-i; j++) {
                // if the current element is less than the previous element
                if(array[j]<array[j-1]) {
                    // swap the elements
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
