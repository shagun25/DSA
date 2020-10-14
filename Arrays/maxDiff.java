import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{   
    
    static int maxDiff(int arr[]){
        int n = arr.length;
        int minval=arr[0];
        int maxdiff=arr[1]-arr[0];
        for(int i=1;i<n;i++){
            maxdiff=Math.max(maxdiff,arr[i]-minval);
            minval=Math.min(minval,arr[i]);
        }
        return maxdiff;
    }
  
    public static void main(String args[]) 
    { 
      int arr[] = {7,10,4,10,6,5,2,3};
      System.out.println("Maximum difference in an array:");
      System.out.println(maxDiff(arr));
      
    } 

}