/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;
import static java.lang.System.out;
class GFG {
    static int parent[];
    static void initialize(){
        for(int i=0;i<parent.length;i++)
        parent[i]=i;
    }
    static int find(int x){
        if(parent[x]==x)
        return x;
        else
        return find(parent[x]);
    }
    static void union(int x,int y){
        int rep_x = find(x);
        int rep_y = find(y);
        if(rep_x==rep_y)
        return;
        parent[rep_y]=rep_x;
    }
	public static void main (String[] args) {
	    int n = 5;
		parent = new int[n];
		initialize();
		union(0,2);
		union(2,4);
		out.println(find(4));
		out.println(find(3));
	}
}