import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{   static void maxProfit(int arr[]){
    int n=arr.length,prof=0;
    for(int i=1;i<n;i++){
        if(arr[i]>arr[i-1]){
            prof+=arr[i]-arr[i-1];
        }
    }
    System.out.println(prof);
    }
    public static void main(String args[]) 
    { 
      int arr[]={1,3,2,5,7};
      maxProfit(arr);
    } 

}