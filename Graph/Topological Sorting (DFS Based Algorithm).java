/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
	} 
	static void DFS(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[],Stack<Integer> st){
	    visited[s]=true;
	    for(int u:adj.get(s)){
	         if(!visited[u])
	          DFS(adj,u,visited,st);
	    }
	    st.push(s);
	}
	static void topologicalSort(ArrayList<ArrayList<Integer>> adj,int V){
	    boolean visited[] = new boolean[V];
	    Stack<Integer> st = new Stack<Integer>();
	    for(int i=0;i<V;i++)
	        if(!visited[i])
	          DFS(adj,i,visited,st);
	    
	    for(int i=0;i<V;i++)
	    System.out.print(st.pop()+" ");
	}
	public static void main (String[] args) {
		int V = 5; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

			addEdge(adj,0, 1); 
            addEdge(adj,1, 3); 
            addEdge(adj,2, 3); 
            addEdge(adj,3, 4); 
            addEdge(adj,2, 4); 
		
		System.out.println("Following is a Topological Sort of"); 
        topologicalSort(adj,V);
	}
}