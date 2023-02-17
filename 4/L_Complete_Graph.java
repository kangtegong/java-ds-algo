import java.util.ArrayList;
import java.util.List;

public class L_Complete_Graph {
  private int V;
  private List<List<Integer>> adj;

  public L_Complete_Graph(int V) {
    this.V = V;
    adj = new ArrayList<>(V);

    for (int i = 0; i < V; i++)
      adj.add(new ArrayList<>());
  }

  public void addEdge(int u, int v) {
    adj.get(u).add(v);
    adj.get(v).add(u);
  }

  public void addCompleteGraph() {
    for (int i = 0; i < V; i++) {
      for (int j = i + 1; j < V; j++) {
        addEdge(i, j);
      }
    }
  }

  public void printGraph() {
    for (int i = 0; i < V; i++) {
      System.out.println("Adjacency list of vertex " + i);
      System.out.print("head");
      for (Integer pCrawl : adj.get(i)) {
        System.out.print(" -> " + pCrawl);
      }
      System.out.println("\n");
    }
  }

  public static void main(String args[]) {
    L_Complete_Graph g = new L_Complete_Graph(5);
    g.addCompleteGraph();

    g.printGraph();
  }
}
