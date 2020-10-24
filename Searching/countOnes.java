/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static int countOnes(int arr[]){
        int n = arr.length;
        int low=0,high=n-1;
         while(low<=high) {   
            int mid = (low+high)/2;
            if(arr[mid]==0)
             low = mid+1;
            else
            if(mid==0 || arr[mid]!=arr[mid-1])
            return n-mid;
            else
            high = mid-1;
        }
      return 0;
    }
 
	public static void main (String[] args) {
	int arr[] = {0,0,1,1,1,1,1};
	System.out.print(countOnes(arr));
	}
}