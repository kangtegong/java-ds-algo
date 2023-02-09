import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_1 {
    public static void main(String[] args) {
        // Creating lists
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        List<String> vector = new Vector<>();

        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Adding element at a specific index
        arrayList.add(1, "Blueberry");
        linkedList.add(1, "Blueberry");
        vector.add(1, "Blueberry");

        // Removing element
        arrayList.remove("Banana");
        linkedList.remove("Banana");
        vector.remove("Banana");

        // Getting element at index
        String element1 = arrayList.get(1);
        String element2 = linkedList.get(1);
        String element3 = vector.get(1);

        // Getting index of an element
        int index1 = arrayList.indexOf("Cherry");
        int index2 = linkedList.indexOf("Cherry");
        int index3 = vector.indexOf("Cherry");

        // Checking if list is empty
        boolean isEmpty1 = arrayList.isEmpty();
        boolean isEmpty2 = linkedList.isEmpty();
        boolean isEmpty3 = vector.isEmpty();

        // Printing out the lists
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Vector: " + vector);

        // Printing out the elements and indexes
        System.out.println("Element at index 1 in ArrayList: " + element1);
        System.out.println("Element at index 1 in LinkedList: " + element2);
        System.out.println("Element at index 1 in Vector: " + element3);
        System.out.println("Index of Cherry in ArrayList: " + index1);
        System.out.println("Index of Cherry in LinkedList: " + index2);
        System.out.println("Index of Cherry in Vector: " + index3);

        // Printing out if list is empty
        System.out.println("Is ArrayList empty? " + isEmpty1);
        System.out.println("Is LinkedList empty? " + isEmpty2);
        System.out.println("Is Vector empty? " + isEmpty3);
    }
}
