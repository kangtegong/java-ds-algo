import java.util.Arrays;

public class A_Complete_Graph {
  int nodes;
  int[][] graph;

  public A_Complete_Graph(int nodes) {
    this.nodes = nodes;
    graph = new int[nodes][nodes];
    for (int i = 0; i < nodes; i++) {
      for (int j = 0; j < nodes; j++) {
        if (i == j) {
          continue;
        }
        graph[i][j] = 1;
      }
    }
  }

  public void printGraph() {
    for (int i = 0; i < nodes; i++) {
      System.out.println(Arrays.toString(graph[i]));
    }
  }

  public static void main(String[] args) {
    A_Complete_Graph complete = new A_Complete_Graph(5);
    complete.printGraph();
  }
}
