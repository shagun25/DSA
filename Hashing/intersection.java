/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;
import java.lang.*;
class GFG {
	public static void main (String[] args) {
	    int arr1[] = new int[]{15, 17, 27, 27, 28, 15};
        int arr2[] = new int[]{16, 17, 28, 17, 31, 17};
        int m = arr1.length;
        int n = arr2.length;
        
        System.out.println(intersection(arr1, m, arr2, n));
	}
	static int intersection(int a[],int m,int b[],int n){
	    Set<Integer> h = new HashSet<Integer>();
	    for(int i:a)
	    h.add(i);
	    
	    int res=0;
	    for(int j=0;j<n;j++){
	        if(h.contains(b[j])){
	            res++;
	            h.remove(b[j]);
	        }
	    }
	    return res;
	}
}