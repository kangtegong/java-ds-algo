class RecursiveBinarySearch {
    // binarySearch method performs the binary search algorithm recursively
    public static int binarySearch(int[] arr, int target, int left, int right) {
        // if left is less than or equal to right, continue the search
        if (left <= right) {
            // calculate the mid point
            int mid = (left + right) / 2;

            // if the target is found at mid, return the index
            if (arr[mid] == target) {
                return mid;
            }
            // if the target is greater than the mid element, recursively call the binarySearch method with updated left and right pointers
            else if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, right);
            }
            // if the target is less than the mid element, recursively call the binarySearch method with updated left and right pointers
            else {
                return binarySearch(arr, target, left, mid - 1);
            }
        }
        // if the target is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 9};
        int target = 6;
        int left = 0;
        int right = arr.length - 1;

        // call the binarySearch method and store the result
        int result = binarySearch(arr, target, left, right);

        // if the result is -1, the target is not found
        if (result == -1) {
            System.out.println("Element not found");
        }
        // if the result is not -1, the target is found at the result index
        else {
            System.out.println("Element found at index: " + result);
        }
    }
}
