import java.util.LinkedList;

public class List_ex1 {
  public static void main(String[] args) {
    // Create a new LinkedList
    LinkedList<String> names = new LinkedList<>();
    
    // Add elements to the LinkedList
    names.add("John");
    names.add("Mike");
    names.add("Emily");
    
    // Print the LinkedList
    System.out.println("Original LinkedList: " + names);
    
    // Add an element at the first position
    names.addFirst("Robert");
    System.out.println("LinkedList after adding element at first position: " + names);
    
    // Add an element at the last position
    names.addLast("Emily");
    System.out.println("LinkedList after adding element at last position: " + names);
    
    // Remove the first element
    names.removeFirst();
    System.out.println("LinkedList after removing first element: " + names);
    
    // Remove the last element
    names.removeLast();
    System.out.println("LinkedList after removing last element: " + names);
  }
}
