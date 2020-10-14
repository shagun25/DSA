/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static int remDups(int arr[]){
        int res=1,n= arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[res-1])
            {
                arr[res]=arr[i];
                res++;
            }
        }
    return res;
    }
	public static void main (String[] args) {
	 int arr[] = {10,20,20,30,30,30,30};
	 
	  System.out.println("Before removal:");
	  for(int i:arr)
	 System.out.print(i+" ");
	 
      System.out.println("");
      
	   System.out.println("After removal:");
	   System.out.println("Size of array: "+remDups(arr));
	     for(int i:arr)
	 System.out.print(i+" ");
	 
	}
}