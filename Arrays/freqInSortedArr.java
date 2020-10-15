import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{   
    
    static void freq(int arr[])
    {
        int n = arr.length,count=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]!=arr[i])
            {
               System.out.println(arr[i-1]+" "+count+" ");
               count=1;
            }
            else
                count++;
        }

            System.out.println(arr[n-1]+" "+count+" ");
    }
  
    public static void main(String args[]) 
    { 
      int arr[] = {10,10,10,20,30,30};
      System.out.println("freq of an array:");
      freq(arr);
      
    } 

}