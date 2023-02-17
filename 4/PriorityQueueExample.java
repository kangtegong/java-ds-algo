import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        pq.add(10);
        pq.add(20);
        pq.add(15);

        // Printing the top element of the PriorityQueue
        System.out.println("Top element of the PriorityQueue: " + pq.peek());

        // Removing the top element from the PriorityQueue
        pq.poll();

        // Printing all the elements of the PriorityQueue
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
