import java.util.Arrays;

public class Array_5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // length 메서드 사용
        int length = array.length;
        System.out.println("array length: " + length);

        // clone 메서드 사용
        int[] clonedArray = array.clone();
        System.out.println("original array: " + Arrays.toString(array));
        System.out.println("cloned array: " + Arrays.toString(clonedArray));
    }
}
