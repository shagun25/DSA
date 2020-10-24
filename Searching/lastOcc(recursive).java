/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static int lastOcc(int arr[],int low,int high,int x){
        int n = arr.length;
            if(low>high)
             return -1;
             
            int mid = (low+high)/2;
            if(arr[mid]>x)
            return lastOcc(arr,low,mid-1,x);
            else if(arr[mid]<x)
            return lastOcc(arr,mid+1,high,x);
            else
            if(mid==n-1 || arr[mid]!=arr[mid+1])
            return mid;
            else
            return lastOcc(arr,mid+1,high,x);
    }
	public static void main (String[] args) {
	int arr[] = {10,20,20,20,30,30,50};
	int x = 20;
	int n = arr.length;
    int low=0,high=n-1;
        
	System.out.print(lastOcc(arr,low,high,x));
	}
}