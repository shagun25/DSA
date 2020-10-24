/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static int binarySearch(int arr[],int low,int high,int x){
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x)
            return mid;
            else if(arr[mid]>x)
            high = mid-1;
            else
            low = mid+1;
        }
        return -1;
    }
    static int search(int arr[],int x){
        if(arr[0]==x)
        return 0;
        int i=1;
        while(arr[i]<x)
        i=i*2;
        if(arr[i]==x)
        return i;
        return binarySearch(arr,i/2+1,i-1,x);
    }
	public static void main (String[] args) {
	int arr[] ={1,10,15,20,40,60,80,100,200,500,600,800,1000,1298,1399,5000,6000,8000};
	System.out.println(search(arr,100));
	
	}
}