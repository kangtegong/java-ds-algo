import java.util.Arrays;

public class Sorting_1 {

	public static void main(String[] args) {
		int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

		String[] names = {"John", "Adam", "Sophie", "Emily", "Michael"};
		Arrays.parallelSort(names);
		System.out.println(Arrays.toString(names));
	}
}
