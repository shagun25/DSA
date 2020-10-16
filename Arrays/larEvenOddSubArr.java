import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    static int larEvenOddSubArr(int arr[]){
        int n = arr.length,count=1,res=1;
        for(int i=1;i<n;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
               count++;
               res = Math.max(count,res);
            }
                
            else
            {
                count=1;
            }
    }
        return res;
    }
    public static void main(String args[]) 
    { 
       int arr[] = {10,12,14,7,8,8,13,2,7,6};

       System.out.println(larEvenOddSubArr(arr));

    } 

}