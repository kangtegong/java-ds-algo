import java.util.TreeMap;

public class TreeMapExample {
  public static void main(String[] args) {
    // TreeMap generation
    TreeMap<Integer, String> treeMap = new TreeMap<>();

    // create element with put
    treeMap.put(1, "One");
    treeMap.put(2, "Two");
    treeMap.put(3, "Three");
    treeMap.put(4, "Four");
    treeMap.put(5, "Five");

    // search fierst key with firstKey
    int firstKey = treeMap.firstKey();
    System.out.println("First Key: " + firstKey);

    // search last key with lastKey
    int lastKey = treeMap.lastKey();
    System.out.println("Last Key: " + lastKey);

    // obtain specific key with get 
    String value = treeMap.get(3);
    System.out.println("Value for key 3: " + value);

    // remove element with remove
    treeMap.remove(4);

    // get all keys with keySet
    System.out.println("Keys: " + treeMap.keySet());

    // get all values as Collectiosn with values
    System.out.println("Values: " + treeMap.values());

    // get all key-value entries with entrySet
    System.out.println("Entries: " + treeMap.entrySet());

    int size = treeMap.size();
    System.out.println("Size: " + size);

    treeMap.clear();

    boolean isEmpty = treeMap.isEmpty();
    System.out.println("TreeMap is empty: " + isEmpty);
  }
}
