/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    // static void swap(int a,int b){
    // int temp = b;
    // b=a;
    // a=temp;
    // }
    static void moveZeroestoEnd(int arr[]){
       int n = arr.length,count=0;
       for(int i=0;i<n;i++){
           if(arr[i]!=0){
            //   swap(arr[i],arr[count]);
            int temp = arr[i];
            arr[i]=arr[count];
            arr[count]=temp;
               count++;
           }
       }
    }
	public static void main (String[] args) {
	 int arr[] = {10,20,0,0,30,0};
	 
	  System.out.println("Before moving:");
	  for(int i:arr)
	 System.out.print(i+" ");
	 
      System.out.println("");
      
	   System.out.println("After moving:");
	  moveZeroestoEnd(arr);
	     for(int i:arr)
	 System.out.print(i+" ");
	 
	}
}