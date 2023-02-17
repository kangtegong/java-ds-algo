class A_Weighted_Graph {
    int vertices;
    int[][] edges;

    A_Weighted_Graph(int vertices) {
        this.vertices = vertices;
        this.edges = new int[vertices][vertices];
    }

    public void addEdge(int source, int dest, int weight) {
        edges[source][dest] = weight;
        edges[dest][source] = weight;
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int j = 0; j < vertices; j++) {
                if (edges[i][j] != 0) {
                    System.out.print(j + " with weight " + edges[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        A_Weighted_Graph graph = new A_Weighted_Graph(5);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 5);
        graph.addEdge(2, 3, 2);
        graph.addEdge(3, 4, 3);
        graph.printGraph();
    }
}
