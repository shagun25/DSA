/*package whatever //do not write package name here */
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class Edge implements Comparable<Edge>{ 
		int src, dest, weight; 

		// Comparator function used for sorting edges 
		// based on their weight 
		public int compareTo(Edge compareEdge) 
		{ 
			return this.weight-compareEdge.weight; 
		} 
};
class subset 
{ 
		int parent, rank; 
}; 
class GFG {
   static int V,E;
   static Edge edge[];
		// A utility function to find set of an element i 
	// (uses path compression technique) 
	static int find(subset subsets[], int i) 
	{ 
		// find root and make root as parent of i (path compression) 
		if (subsets[i].parent != i) 
			subsets[i].parent = find(subsets, subsets[i].parent); 

		return subsets[i].parent; 
	} 

	// A function that does union of two sets of x and y 
	// (uses union by rank) 
	static void Union(subset subsets[], int x, int y) 
	{ 
		int xroot = find(subsets, x); 
		int yroot = find(subsets, y); 

		// Attach smaller rank tree under root of high rank tree 
		// (Union by Rank) 
		if (subsets[xroot].rank < subsets[yroot].rank) 
			subsets[xroot].parent = yroot; 
		else if (subsets[xroot].rank > subsets[yroot].rank) 
			subsets[yroot].parent = xroot; 

		// If ranks are same, then make one as root and increment 
		// its rank by one 
		else
		{ 
			subsets[yroot].parent = xroot; 
			subsets[xroot].rank++; 
		} 
	} 

	// The main function to construct MST using Kruskal's algorithm 
	static void KruskalMST() 
	{ 
		Edge result[] = new Edge[V]; // Tnis will store the resultant MST 
		int e = 0; // An index variable, used for result[] 
		int i = 0; // An index variable, used for sorted edges 
		for (i=0; i<V; ++i) 
			result[i] = new Edge(); 

		// Step 1: Sort all the edges in non-decreasing order of their 
		// weight. If we are not allowed to change the given graph, we 
		// can create a copy of array of edges 
		Arrays.sort(edge); 

		// Allocate memory for creating V ssubsets 
		subset subsets[] = new subset[V]; 
		for(i=0; i<V; ++i) 
			subsets[i]=new subset(); 

		// Create V subsets with single elements 
		for (int v = 0; v < V; ++v) 
		{ 
			subsets[v].parent = v; 
			subsets[v].rank = 0; 
		} 

		i = 0; // Index used to pick next edge 

        int res =0;
		// Number of edges to be taken is equal to V-1 
		while (e < V - 1) 
		{ 
			// Step 2: Pick the smallest edge. And increment 
			// the index for next iteration 
			Edge next_edge = new Edge(); 
			next_edge = edge[i++]; 

			int x = find(subsets, next_edge.src); 
			int y = find(subsets, next_edge.dest); 

			// If including this edge does't cause cycle, 
			// include it in result and increment the index 
			// of result for next edge 
			if (x != y) 
			{ 
				result[e++] = next_edge; 
				Union(subsets, x, y); 
				
				res+=next_edge.weight;
			} 
			// Else discard the next_edge 
		} 

		// print the contents of result[] to display 
		// the built MST 
	
	    System.out.println("Weight of MST is: "+res); 
	} 

	public static void main (String[] args) {
	     V = 5; // Number of vertices in graph 
		E = 7;
	    edge= new Edge[E]; 
		for (int i=0; i<E; ++i) 
			edge[i] = new Edge(); 
	    
	    edge[0].src = 0; 
		edge[0].dest = 1; 
		edge[0].weight = 10; 

		// add edge 0-2 
		edge[1].src = 0; 
		edge[1].dest = 2; 
		edge[1].weight = 8; 

		// add edge 0-3 
		edge[2].src = 1; 
		edge[2].dest = 2; 
		edge[2].weight = 5; 

		// add edge 1-3 
		edge[3].src = 1; 
		edge[3].dest = 3; 
		edge[3].weight = 3; 

		// add edge 2-3 
		edge[4].src = 2; 
		edge[4].dest = 3; 
		edge[4].weight = 4; 
		
		//add egde 2-4
		edge[5].src = 2; 
		edge[5].dest = 4; 
		edge[5].weight = 12;
		
		// add edge 3-4
		edge[6].src = 3; 
		edge[6].dest = 4; 
		edge[6].weight = 15; 

		KruskalMST(); 
	}
}