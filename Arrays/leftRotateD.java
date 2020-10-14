import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    static void swap(int arr[],int a,int b){
     int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void reverse(int arr[],int low,int high){
        while(low<high){
            swap(arr,low,high);
            low++;
            high--;
        }
    }
    static void leftRotateD(int arr[],int d){
        int n=arr.length;
      reverse(arr,0,d-1);
      reverse(arr,d,n-1);
      reverse(arr,0,n-1);
    }

    public static void main(String args[]) 
    { 
      int arr[] = {1,2,3,4,5};
      int d=2;
      System.out.println("Before rotation:");
      for(int i:arr)
     System.out.print(i+" ");
     System.out.println("");
     leftRotateD(arr,d);
      System.out.println("After left Rotation By D");
      for(int i:arr)
     System.out.print(i+" ");
      
    } 

}