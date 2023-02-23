import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    
    public static void main(String[] args) {
        // Create a new HashSet object
        HashSet<String> hashSet = new HashSet<>();
        
        // Add elements to the HashSet
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");
        hashSet.add("pear");
        
        // Print the HashSet
        System.out.println("The HashSet contains: " + hashSet);
        
        // Check if an element exists in the HashSet
        boolean contains = hashSet.contains("banana");
        System.out.println("The HashSet contains 'banana': " + contains);
        
        // Get the size of the HashSet
        int size = hashSet.size();
        System.out.println("The size of the HashSet is: " + size);
        
        // Remove an element from the HashSet
        hashSet.remove("orange");
        System.out.println("The HashSet after removing 'orange': " + hashSet);
        
        // Iterate over the elements in the HashSet using an iterator
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
        }
        
        // Clear all elements in the HashSet
        hashSet.clear();
        System.out.println("The HashSet after clearing all elements: " + hashSet);
    }
}
