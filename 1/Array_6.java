import java.util.Arrays;

public class Array_6 {
    public static void main(String[] args) {
        int[] array1 = {3, 1, 4, 2, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {5, 2, 3, 4, 1};

        // sort() : 배열을 정렬합니다.
        Arrays.sort(array1);
        System.out.println("sort() : " + Arrays.toString(array1));

        // binarySearch() : 배열에서 원소를 이진 검색합니다.
        int searchIndex = Arrays.binarySearch(array1, 3);
        System.out.println("binarySearch() : " + searchIndex);

        // equals() : 두 배열이 같은지 비교합니다.
        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println("equals() : " + isEqual);

        // fill() : 배열의 모든 원소를 특정 값으로 채웁니다.
        Arrays.fill(array3, 0);
        System.out.println("fill() : " + Arrays.toString(array3));

        // copyOf() : 배열을 복사합니다.
        int[] copyOfArray1 = Arrays.copyOf(array1, array1.length);
        System.out.println("copyOf() : " + Arrays.toString(copyOfArray1));

        // toString() : 배열을 문자열로 변환합니다.
        System.out.println("toString() : " + Arrays.toString(array1));

        // stream() : 배열을 Stream 형식으로 변환합니다.
        Arrays.stream(array1).forEach(System.out::println);

        // asList() : 배열을 List 형식으로 변환합니다.
        System.out.println("asList() : " + Arrays.asList(array1));
    }
}
