import java.util.*; 

class Graph { 

	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 

	static void DFS(ArrayList<ArrayList<Integer>> adj, boolean visited[],int s) 
	{ 

    	visited[s] = true; 
    		 
    		for(int v:adj.get(s)){
    		    if(visited[v]==false){
    		        DFS(adj,visited,v);
    		    }
        	} 
	} 
   static int DFSRec(ArrayList<ArrayList<Integer>> adj,int V) {
       	boolean[] visited=new boolean[V]; 
       	int count = 0;
    	for(int i = 0; i < V; i++) 
    		visited[i] = false; 
    	for(int i = 0; i < V; i++){	
    	    if(visited[i]==false){
    	        count++;
        	DFS(adj,visited,i);
    	    }
    	}
    	return count;
   }
	public static void main(String[] args) 
	{  
		int V = 8; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

		addEdge(adj,0,1); 
    	addEdge(adj,0,2); 
    	addEdge(adj,2,3); 
    	addEdge(adj,1,3);
    	addEdge(adj,1,4);
    	addEdge(adj,4,5);
		
		addEdge(adj,6,7);
		
		System.out.print("Number of islands: "+DFSRec(adj,V)); 
	    
	} 
} 
