import java.util.Arrays;

public class Sorting_4 {

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        insertionSort(array);

        // print the sorted array
        // System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
             System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr) {
        // Loop through the array, starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Store the current element
            int current = arr[i];
            // Start comparing the current element with the sorted portion of the array
            int j = i - 1;
            // While the previous element is greater than the current element and we're still in the array bounds
            while (j >= 0 && arr[j] > current) {
                // Shift the previous element to the right
                arr[j + 1] = arr[j];
                // Move to the next element in the sorted portion
                j--;
            }
            // Insert the current element into its proper position in the sorted portion
            arr[j + 1] = current;
        }
    }
}
