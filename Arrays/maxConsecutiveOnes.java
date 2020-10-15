import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{   
    static int maxConsecutiveOne(int arr[]){
        int n=arr.length,max=0,count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
            count=0;
            else{
                count++;
            max=Math.max(max,count);
            }
        }
        return max;
    }
    public static void main(String args[]) 
    { 
      int arr[]={0,1,0,1,1,1};
      System.out.println(maxConsecutiveOne(arr));;
    } 

}