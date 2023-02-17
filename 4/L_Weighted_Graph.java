import java.util.ArrayList;
import java.util.List;

class Pair {
  int u, v, w;

  Pair(int u, int v, int w) {
    this.u = u;
    this.v = v;
    this.w = w;
  }
}

public class L_Weighted_Graph {
  private int V;
  private List<Pair> edges;

  public L_Weighted_Graph(int V) {
    this.V = V;
    edges = new ArrayList<>();
  }

  public void addEdge(int u, int v, int w) {
    edges.add(new Pair(u, v, w));
  }

  public void printGraph() {
    for (Pair p : edges) {
      System.out.println("Edge from vertex " + p.u + " to vertex " + p.v + " with weight " + p.w);
    }
  }

  public static void main(String args[]) {
    L_Weighted_Graph g = new L_Weighted_Graph(5);
    g.addEdge(0, 1, 2);
    g.addEdge(0, 3, 6);
    g.addEdge(1, 2, 3);
    g.addEdge(2, 3, 1);
    g.addEdge(3, 4, 5);

    g.printGraph();
  }
}
