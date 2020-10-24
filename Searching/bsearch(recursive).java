/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static int bsearch(int arr[],int low,int high,int x){
            if(low>high)
             return -1;
             
            int mid = (low+high)/2;
            if(arr[mid]==x)
            return mid;
            else if(arr[mid]<x)
            return bsearch(arr,mid+1,high,x);
            else
            return bsearch(arr,low,mid-1,x);
    }
	public static void main (String[] args) {
		int arr[] = {10,20,30,40,50,60,70};
		int x=25;
		int low = 0;
		int high = arr.length-1;
		System.out.println(bsearch(arr,low,high,x));
	}
}