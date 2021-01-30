// Adjacency Matrix representation in Java

public class Graph {
  private boolean mat[][];
  private int V;

  // Initialize the matrix
  public Graph(int numVertices) {
    V = numVertices;
    mat = new boolean[V][V];
  }

  // Add edges
  public void addEdge(int i, int j) {
    mat[i][j] = true;
    mat[j][i] = true;
  }

  // Remove edges
  public void removeEdge(int i, int j) {
    mat[i][j] = false;
    mat[j][i] = false;
  }

  // Print the matrix
  public String toString() 
  {
    StringBuilder s = new StringBuilder();
    
    for (int i = 0; i < V; i++) 
    {
      s.append(i + ": ");
      for (boolean j : mat[i]) 
      {
        s.append((j ? 1 : 0) + " ");
      }
      s.append("\n");
    }
    return s.toString();
  }

  public static void main(String args[]) {
    Graph g = new Graph(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);

    System.out.print(g.toString());
  }
}