import java.util.Hashtable;

public class HashtableExample {
    
    public static void main(String[] args) {
        // Create a new Hashtable object
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        
        // Add key-value pairs to the Hashtable
        hashtable.put("apple", 10);
        hashtable.put("banana", 20);
        hashtable.put("orange", 30);
        
        // Get the value associated with a specific key
        int value = hashtable.get("banana");
        System.out.println("The value of banana is: " + value);
        
        // Check if a key exists in the Hashtable
        boolean containsKey = hashtable.containsKey("apple");
        System.out.println("The Hashtable contains the key 'apple': " + containsKey);
        
        // Check if a value exists in the Hashtable
        boolean containsValue = hashtable.containsValue(30);
        System.out.println("The Hashtable contains the value 30: " + containsValue);
        
        // Get the size of the Hashtable
        int size = hashtable.size();
        System.out.println("The size of the Hashtable is: " + size);
        
        // Remove a key-value pair from the Hashtable
        hashtable.remove("orange");
        System.out.println("The Hashtable after removing the key 'orange': " + hashtable);
        
        // Iterate over the key-value pairs in the Hashtable
        for (String key : hashtable.keySet()) {
            int val = hashtable.get(key);
            System.out.println("Key: " + key + ", Value: " + val);
        }
    }
}
