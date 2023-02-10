import java.util.Arrays;

public class Sorting_7 {

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        quickSort(array, 0, array.length - 1);

        // print the sorted array
        // System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
             System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] array, int low, int high) {
        // base case for recursion: if low index is greater than or equal to high index
        if (low >= high) {
            return;
        }

        // choose a pivot element from the array
        int pivotIndex = partition(array, low, high);

        // sort elements before pivot
        quickSort(array, low, pivotIndex - 1);

        // sort elements after pivot
        quickSort(array, pivotIndex + 1, high);
    }

    private static int partition(int[] array, int low, int high) {
        // choose the rightmost element as the pivot
        int pivot = array[high];

        // index of smaller element
        int i = low - 1;

        // traverse through all elements in the subarray
        for (int j = low; j < high; j++) {
            // if current element is smaller or equal to pivot
            if (array[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap arr[i + 1] and arr[high]
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the pivot index
        return i + 1;
    }


}
