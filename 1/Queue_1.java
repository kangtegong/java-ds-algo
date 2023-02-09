import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {
    public static void main(String[] args) {
        // Create a new queue
        Queue<Integer> queue = new LinkedList<>();

        // Offer an element to the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        // Peek at the head of the queue
        System.out.println("Head of queue: " + queue.peek()); // Output: Head of queue: 1

        // Remove and return the head of the queue
        System.out.println("Removed element: " + queue.remove()); // Output: Removed element: 1

        // Check if the queue is empty
        System.out.println("Queue empty: " + queue.isEmpty()); // Output: Queue empty: false

        // Poll the head of the queue
        System.out.println("Polled element: " + queue.poll()); // Output: Polled element: 2

        // Clear the queue
        queue.clear();

        // Check if the queue is empty
        System.out.println("Queue empty: " + queue.isEmpty()); // Output: Queue empty: true

        try {
            System.out.println("Head of queue: " + queue.element());
        } catch (Exception e) {
            System.out.println("Queue is empty");
        }
    }
}
