/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static boolean sorted(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++)
          if(arr[i]<arr[i-1])
          return false;
    return true;
    }
	public static void main (String[] args) {
	 int arr[] = {5,8,20,40};
	 System.out.println(sorted(arr));
	}
}