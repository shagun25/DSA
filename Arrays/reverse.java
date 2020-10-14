/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static void reverse(int arr[]){
        int high = arr.length-1,low=0;
        while(high>low){
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        
    }
	public static void main (String[] args) {
	 int arr[] = {5,8,20,40};
	 
	  System.out.println("Before reverse:");
	  for(int i:arr)
	 System.out.print(i+" ");
	 
      System.out.println("");
      
	   System.out.println("After reverse:");
	   reverse(arr);
	     for(int i:arr)
	 System.out.print(i+" ");
	}
}