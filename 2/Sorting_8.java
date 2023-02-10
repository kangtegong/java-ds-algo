import java.util.Arrays;

public class Sorting_8 {

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        mergeSort(array, 0, array.length - 1);

        // System.out.println(Arrays.toString(array));
        // print the sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void mergeSort(int[] array, int left, int right) {
        // checks if the left pointer is smaller than the right pointer
        // this is the termination condition for recursion
        if (left < right) {
            // finds the middle point of the array by averaging the left and right pointers
            int middle = (left + right) / 2;
            // sorts the left half of the array
            mergeSort(array, left, middle);
            // sorts the right half of the array
            mergeSort(array, middle + 1, right);
            // merges the sorted left and right halves of the array
            merge(array, left, middle, right);
        }
    }

    public static void merge(int[] array, int left, int middle, int right) {
        // calculates the size of the left half of the array
        int leftSize = middle - left + 1;
        // calculates the size of the right half of the array
        int rightSize = right - middle;
        // creates a new array to store the left half of the original array
        int[] leftArray = new int[leftSize];
        // creates a new array to store the right half of the original array
        int[] rightArray = new int[rightSize];

        // fills the leftArray with the elements from the left half of the original array
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = array[left + i];
        }
        // fills the rightArray with the elements from the right half of the original array
        for (int i = 0; i < rightSize; i++) {
            rightArray[i] = array[middle + 1 + i];
        }

        // pointers to keep track of the current position in the leftArray and rightArray
        int leftIndex = 0;
        int rightIndex = 0;
        // pointer to keep track of the current position in the original array
        int arrayIndex = left;

        // loop to compare and merge elements from the leftArray and rightArray into the original array
        // continues until all elements from either the leftArray or rightArray have been added to the original array
        while (leftIndex < leftSize && rightIndex < rightSize) {
            // checks which element from the leftArray or rightArray is smaller
            // adds the smaller element to the original array and increments the corresponding pointer
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[arrayIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[arrayIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            // increments the pointer to the original array
            arrayIndex++;
        }

        // adds the remaining elements from the leftArray to the original array
        while (leftIndex < leftSize) {
            array[arrayIndex] = leftArray[leftIndex];
            leftIndex++;
            arrayIndex++;
        }
        // adds the remaining elements from the rightArray to the original array
        while (rightIndex < rightSize) {
            array[arrayIndex] = rightArray[rightIndex];
            rightIndex++;
            arrayIndex++;
        }
    }


}
