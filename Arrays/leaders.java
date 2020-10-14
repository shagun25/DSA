import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{   
    
    static void reverse(ArrayList<Integer> temp)
    {
        int low=0,high=temp.size()-1;
        while(low<high){
            Collections.swap(temp,low,high);
            low++;
            high--;
        }
        temp.forEach((n)->System.out.print(n+" "));
    }
    static void leaders(int arr[]){
    int n= arr.length,k=0;
    int curr_lead=arr[n-1];
    ArrayList<Integer> temp=new ArrayList<Integer>();
     temp.add(curr_lead);
    for(int i=n-2;i>=0;i--){
        if(arr[i]>curr_lead){
            curr_lead=arr[i];
            temp.add(curr_lead);
        }
    }
    reverse(temp);
}
  
    public static void main(String args[]) 
    { 
      int arr[] = {7,10,4,10,6,5,2,3};
      System.out.println("Leaders in an array:");
      leaders(arr);
      
    } 

}