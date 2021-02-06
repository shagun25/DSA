import java.util.*;

class GFG {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void BFS(ArrayList<ArrayList<Integer>> adj,int v,int s){
        Queue<Integer> q = new LinkedList<Integer>();
        boolean visited[] = new boolean[v];
        for(int i = 0; i < v; i++) 
    		visited[i] = false; 
        visited[s]=true;
        q.add(s);
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u+" ");
            for(int i:adj.get(u)){
                if(!visited[i]){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
        
    }
	public static void main (String[] args) {
		int v = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<v;i++)
		adj.add(new ArrayList<Integer>());
		
		addEdge(adj,0,1);
		addEdge(adj,0,2);
		addEdge(adj,1,2);
		addEdge(adj,2,4);
		addEdge(adj,1,3);
		addEdge(adj,3,2);
		addEdge(adj,3,4);
		
		BFS(adj,v,0);
	}
}