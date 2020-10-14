/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static int largest(int arr[]){
        int n = arr.length,largest = 0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[largest])
            largest=i;
        }
        return largest;
    }
	public static void main (String[] args) {
	 int arr[] = {5,8,20,10};
	 System.out.println(largest(arr));
	}
}