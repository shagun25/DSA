import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{   static int maxProfit(int arr[],int start,int end){
    int prof=0;
    if(start>=end)
    return 0;
    for(int i=start;i<end;i++){
        for(int j=i+1;j<=end;j++){
            if(arr[j]>arr[i])
            {
                int curr_prof=arr[j]-arr[i]+maxProfit(arr,start,i-1)+maxProfit(arr,j+1,end);
                prof=Math.max(prof,curr_prof);
            }
        }
    }
   return prof;
    }
    public static void main(String args[]) 
    { 
      int arr[]={1,3,2,5,7};
      System.out.println(maxProfit(arr,0,4));;
    } 

}