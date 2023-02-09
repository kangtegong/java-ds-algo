import java.util.LinkedList;

public class List_3 {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("item1");
        myList.add("item2");
        myList.add("item3");
        myList.add("item4");
        myList.add("item5");
        
        // add the specified element at the beginning of the list
        myList.addFirst("newItem1");
        System.out.println("After addFirst: " + myList);
        
        // Add the specified element at the end of the list
        myList.addLast("newItem2");
        System.out.println("After addLast: " + myList);
        
        // Return the first element in the list
        System.out.println("First element: " + myList.getFirst());
        
        // Return the last element in the list
        System.out.println("Last element: " + myList.getLast());
        
        // Remove and returns the first element in the list
        System.out.println("Removed first element: " + myList.removeFirst());
        
        // Remove and returns the last element in the list
        System.out.println("Removed last element: " + myList.removeLast());
        
        System.out.println("Final list: " + myList);
    }
}
