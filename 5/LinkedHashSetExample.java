import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetExample {
    
    public static void main(String[] args) {
        // Create a new LinkedHashSet object
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        
        // Add elements to the LinkedHashSet
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("orange");
        linkedHashSet.add("pear");
        
        // Print the LinkedHashSet
        System.out.println("The LinkedHashSet contains: " + linkedHashSet);
        
        // Check if an element exists in the LinkedHashSet
        boolean contains = linkedHashSet.contains("banana");
        System.out.println("The LinkedHashSet contains 'banana': " + contains);
        
        // Get the size of the LinkedHashSet
        int size = linkedHashSet.size();
        System.out.println("The size of the LinkedHashSet is: " + size);
        
        // Remove an element from the LinkedHashSet
        linkedHashSet.remove("orange");
        System.out.println("The LinkedHashSet after removing 'orange': " + linkedHashSet);
        
        // Iterate over the elements in the LinkedHashSet using an iterator
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
        }
        
        // Clear all elements in the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("The LinkedHashSet after clearing all elements: " + linkedHashSet);
    }
}
