import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    static void leftRotateOne(int arr[]){
        int n=arr.length,temp=arr[0];
        for(int i=1;i<n;i++)
        arr[i-1]=arr[i];
        arr[n-1]=temp;
    }

    public static void main(String args[]) 
    { 
      int arr[] = {1,2,3,4,5};
      System.out.println("Before rotation:");
      for(int i:arr)
     System.out.print(i+" ");
     System.out.println("");
     leftRotateOne(arr);
      System.out.println("After left Rotation By one");
      for(int i:arr)
     System.out.print(i+" ");
      
    } 

}