import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        // Creating a min heap using the PriorityQueue class
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Adding elements to the min heap
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(20);

        // Printing the top element of the min heap
        System.out.println("Top element of the min heap: " + minHeap.peek());

        // Removing the top element from the min heap
        minHeap.poll();

        // Printing all the elements of the min heap
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}
