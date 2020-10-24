/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static int bsearch(int arr[],int x){
        int n = arr.length;
        int low = 0,high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x)
            return mid;
            else if(arr[mid]<x)
            low = mid+1;
            else
            high = mid-1;
        }
        return -1;
    }
	public static void main (String[] args) {
		int arr[] = {10,20,30,40,50,60,70};
		int x=25;
		System.out.println(bsearch(arr,x));
	}
}