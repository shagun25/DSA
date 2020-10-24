/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static int lastOcc(int arr[],int x){
        int n = arr.length;
        int low=0,high=n-1;
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]>x)
            high=mid-1;
            else if(arr[mid]<x)
            low=mid+1;
            else
            if(mid==n-1 || arr[mid]!=arr[mid+1])
            return mid;
            else
            low=mid+1;
        }
        return -1;
    }
	public static void main (String[] args) {
	int arr[] = {10,20,20,20,30,30,50};
	int x = 20;
	System.out.print(lastOcc(arr,x));
	}
}