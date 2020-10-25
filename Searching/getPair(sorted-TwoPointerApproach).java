/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static boolean getPair(int arr[],int x){
        int n = arr.length;
        int low=0,high=n-1;
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
		int arr[] = {2,4,8,9,11,12,20,30};
		System.out.println(getPair(arr,23));
	}
}