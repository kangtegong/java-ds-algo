import java.util.LinkedList;
import java.util.Queue;

public class BFS {

  // Define the main BFS function
  public static void bfs(int[][] graph, int startNode) {
    // Create a queue to store the nodes
    Queue<Integer> queue = new LinkedList<>();
    // Offer the start node into the queue
    queue.offer(startNode);
    // Create a visited array to keep track of the visited nodes
    boolean[] visited = new boolean[graph.length];

    // Loop until the queue is empty
    while (!queue.isEmpty()) {
      // Poll the front node from the queue
      int currentNode = queue.poll();
      // Mark the node as visited
      visited[currentNode] = true;
      // Print the node
      System.out.print(currentNode + " ");

      // Check all the neighbors of the current node
      for (int i = 0; i < graph[currentNode].length; i++) {
        // If the neighbor is connected to the current node and not visited yet
        if (graph[currentNode][i] == 1 && !visited[i]) {
          // Offer the neighbor into the queue
          queue.offer(i);
        }
      }
    }
  }

  public static void main(String[] args) {
    // Define the graph as an adjacency matrix
    int[][] graph = {{0, 1, 1, 0},
                     {1, 0, 1, 1},
                     {1, 1, 0, 0},
                     {0, 1, 0, 0}};
    // Set the start node
    int startNode = 2;
    // Call the BFS function with the graph and the start node
    bfs(graph, startNode);
  }
}
