import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        // Creating a max heap using the PriorityQueue class and reversing the natural ordering
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Adding elements to the max heap
        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(20);

        // Printing the top element of the max heap
        System.out.println("Top element of the max heap: " + maxHeap.peek());

        // Removing the top element from the max heap
        maxHeap.poll();

        // Printing all the elements of the max heap
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
    }
}
