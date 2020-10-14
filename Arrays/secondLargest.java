/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static int secondLargest(int arr[]){
        int n = arr.length,largest = 0,res=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }
            else if(arr[i]<arr[largest]){
                if(res==-1 || arr[i]>arr[res])
                res=i;
            }
            
        }
        return res;
    }
	public static void main (String[] args) {
	 int arr[] = {5,8,20,10};
	 System.out.println(secondLargest(arr));
	}
}