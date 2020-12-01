/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	 int arr[] = new int[]{3, 8, 4, 7, 6, 1};
        int len = arr.length;
        int x = 14;
        System.out.println(pairWithSumX(arr, len, x));
	}
	static boolean pairWithSumX(int arr[],int n,int sum){
	    Set<Integer> h = new HashSet<>();
	    for(int i=0;i<n;i++){
	        if(h.contains(sum-arr[i]))
	        return true;
	        h.add(arr[i]);
	    }
	    return false;
	}
}