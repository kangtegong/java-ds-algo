import java.util.Arrays;

public class Sorting_6 {

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        selectionSort(array);

        // print the sorted array
        // System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
             System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] array) {
        // outer loop to track the sorted part of the array
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            // inner loop to find the minimum element
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // if the minimum element found is not equal to the first element, swap them
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

}
