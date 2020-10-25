/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static boolean gettriplet(int arr[],int x){
        int n=arr.length;
        for(int i=0;i<n;i++)
        if(isPair(arr,i+1,n-1,x-arr[i]))
        return true;
        return false;
    }
    static boolean isPair(int arr[],int low,int high,int x){
        while(low<high){
            if(arr[low]+arr[high]==x)
            return true;
            else if(arr[low]+arr[high]>x)
            high--;
            else
            low++;
        }
        return false;
    }
	public static void main (String[] args) {
		int arr[] = {2,3,4,8,9,20,40};
		System.out.println(gettriplet(arr,32));
	}
}