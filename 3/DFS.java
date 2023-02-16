import java.util.Stack;

public class DFS {

  // Define the main DFS function
  public static void dfs(int[][] graph, int startNode) {
    // Create a stack to store the nodes
    Stack<Integer> stack = new Stack<>();
    // Push the start node into the stack
    stack.push(startNode);
    // Create a visited array to keep track of the visited nodes
    boolean[] visited = new boolean[graph.length];

    // Loop until the stack is empty
    while (!stack.isEmpty()) {
      // Pop the top node from the stack
      int currentNode = stack.pop();
      // Mark the node as visited
      visited[currentNode] = true;
      // Print the node
      System.out.print(currentNode + " ");

      // Check all the neighbors of the current node
      for (int i = 0; i < graph[currentNode].length; i++) {
        // If the neighbor is connected to the current node and not visited yet
        if (graph[currentNode][i] == 1 && !visited[i]) {
          // Push the neighbor into the stack
          stack.push(i);
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
    // Call the DFS function with the graph and the start node
    dfs(graph, startNode);
  }
}
