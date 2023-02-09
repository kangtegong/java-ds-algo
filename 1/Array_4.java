import java.util.Arrays;
import java.util.Iterator;

public class Array_4 {
    public static void main(String[] args) {
	int[] array = {1, 2, 3, 4, 5};

	// for 문을 이용한 접근:
	for (int i = 0; i < array.length; i++) {
    		System.out.println(array[i]);
	}

	// for-each 문을 이용한 접근:
	for (int element : array) {
    		System.out.println(element);
	}

	// Iterator를 이용한 접근:
	Iterator<Integer> iterator = Arrays.stream(array).iterator();
	while (iterator.hasNext()) {
    		System.out.println(iterator.next());
	}

	// 람다식을 이용한 접근:
	Arrays.stream(array).forEach(element -> System.out.println(element));

	// IntStream을 이용한 접근:
	Arrays.stream(array).forEach(System.out::println);

   }
}
