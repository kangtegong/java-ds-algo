import java.util.ArrayList;

public class A_Undirected_Graph {
    private final int[][] adjacencyMatrix;
    private final int numOfNodes;

    public A_Undirected_Graph(int numOfNodes) {
        this.numOfNodes = numOfNodes;
        this.adjacencyMatrix = new int[numOfNodes][numOfNodes];
    }

    public void addEdge(int start, int end) {
        adjacencyMatrix[start][end] = 1;
        adjacencyMatrix[end][start] = 1;
    }

    public void printGraph() {
        for (int i = 0; i < numOfNodes; i++) {
            for (int j = 0; j < numOfNodes; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        A_Undirected_Graph graph = new A_Undirected_Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
    }
}
