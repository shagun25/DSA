/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		  int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;
        
        countFreq(arr, n);
	}
	static void countFreq(int arr[],int n){
	    HashMap <Integer,Integer> h = new HashMap <>();
	    
	      for(int i=0;i<n;i++) 
	      {
            // Integer count = h.getOrDefault(arr[i], 0);
            //  h.put(arr[i], count + 1);
        
            if(h.containsKey(arr[i]) == true)
              h.put(arr[i], h.get(arr[i]) + 1);
            else
              h.put(arr[i], 1);    
          }

	    for(Map.Entry <Integer,Integer> e : h.entrySet())
	    System.out.println(e.getKey()+" "+e.getValue());
	}
}