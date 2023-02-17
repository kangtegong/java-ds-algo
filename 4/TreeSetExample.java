import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Dates");

        // Displaying the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Using the first() method to get the first element
        System.out.println("First Element: " + treeSet.first());

        // Using the last() method to get the last element
        System.out.println("Last Element: " + treeSet.last());

        // Using the headSet() method to get elements less than "Cherry"
        System.out.println("HeadSet Elements: " + treeSet.headSet("Cherry"));

        // Using the tailSet() method to get elements greater than or equal to "Cherry"
        System.out.println("TailSet Elements: " + treeSet.tailSet("Cherry"));

        // Using the subSet() method to get elements between "Banana" (inclusive) and "Dates" (exclusive)
        System.out.println("SubSet Elements: " + treeSet.subSet("Banana", "Dates"));

        // Using the pollFirst() method to remove and return the first element
        String firstElement = treeSet.pollFirst();
        System.out.println("Removed First Element: " + firstElement);
        System.out.println("TreeSet after removing first element: " + treeSet);

        // Using the pollLast() method to remove and return the last element
        String lastElement = treeSet.pollLast();
        System.out.println("Removed Last Element: " + lastElement);
        System.out.println("TreeSet after removing last element: " + treeSet);

        // Using the size() method to get the size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Using the clear() method to remove all elements from the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clear() method: " + treeSet);

        // Using the isEmpty() method to check if the TreeSet is empty
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());
    }
}
