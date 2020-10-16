import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
   static int maxSubArr(int arr[]){
       int n=arr.length,maxEnding=arr[0],res=arr[0];
       for(int i=1;i<n;i++){
           maxEnding=Math.max(maxEnding+arr[i],arr[i]);
           res=Math.max(maxEnding,res);
       }
       return res;
   }
    public static void main(String args[]) 
    { 
       int arr[] = {-5,1,-2,3,-1,2,-2};

       System.out.println(maxSubArr(arr));

    } 

}