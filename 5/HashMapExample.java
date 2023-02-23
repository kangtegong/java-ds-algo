import java.util.HashMap;

public class HashMapExample {
    
    public static void main(String[] args) {
        // Create a new HashMap object
        HashMap<String, Integer> hashmap = new HashMap<>();
        
        // Add key-value pairs to the HashMap
        hashmap.put("apple", 10);
        hashmap.put("banana", 20);
        hashmap.put("orange", 30);
        
        // Get the value associated with a specific key
        int value = hashmap.get("banana");
        System.out.println("The value of banana is: " + value);
        
        // Check if a key exists in the HashMap
        boolean containsKey = hashmap.containsKey("apple");
        System.out.println("The HashMap contains the key 'apple': " + containsKey);
        
        // Check if a value exists in the HashMap
        boolean containsValue = hashmap.containsValue(30);
        System.out.println("The HashMap contains the value 30: " + containsValue);
        
        // Get the size of the HashMap
        int size = hashmap.size();
        System.out.println("The size of the HashMap is: " + size);
        
        // Remove a key-value pair from the HashMap
        hashmap.remove("orange");
        System.out.println("The HashMap after removing the key 'orange': " + hashmap);
        
        // Iterate over the key-value pairs in the HashMap
        for (String key : hashmap.keySet()) {
            int val = hashmap.get(key);
            System.out.println("Key: " + key + ", Value: " + val);
        }
    }
}
