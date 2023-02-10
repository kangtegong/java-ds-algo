import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting_3 {
    public static void main (String[] args) {

        // Collections.sort()
        List<Integer> numbers = Arrays.asList(3, 2, 1, 5, 4);
        Collections.sort(numbers);
        System.out.println("Ascending order: " + numbers);

        // Collections.reverseOrder()
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order: " + numbers);

        // Collections.shuffle()
        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);

        // Collections.sort(List, Comparator)
        List<Integer> numbers2 = Arrays.asList(3, 2, 1, 5, 4);
        Collections.sort(numbers2, (n1, n2) -> n2 - n1);
	// Collections.sort(numbers2, (n1, n2) -> n1 - n2);
        System.out.println("Sorted by own comparator: " + numbers2);
    }
}
