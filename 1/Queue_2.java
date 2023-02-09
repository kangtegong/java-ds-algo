import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Queue_2 {
    public static void main(String[] args) {
        // Creating a Queue
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Print queue variable");
        System.out.println(queue);

        // Using an enhanced for loop to print all elements
        System.out.println("Using an enhanced for loop:");
        for (Integer i : queue) {
            System.out.println(i);
        }

        // Using an iterator to print all elements
        System.out.println("\nUsing an iterator:");
        Iterator<Integer> it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Using a for loop and the poll() method to print all elements
        System.out.println("\nUsing a for loop and the poll() method:");
        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }

        // Adding elements to the Queue again
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        // Using a basic for loop to print all elements
        System.out.println("\nUsing a basic for loop:");
        for (int i = 0; i < queue.size(); i++) {
            System.out.println(queue.peek());
        }
    }
}
