/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static int getPeak(int arr[]){
        int n = arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid]>=arr[mid+1]))
            return arr[mid];
            if(mid>0 && arr[mid-1]>arr[mid])
            high = mid-1;
            else
            low=mid+1;
        }
        return -1;
    }
	public static void main (String[] args) {
		int arr[] = {5,10,20,15,17};
		System.out.println(getPeak(arr));
	}
}