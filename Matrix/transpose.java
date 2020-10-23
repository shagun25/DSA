/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static int n=4;
    static void Swap(int arr[][],int i,int low,int high){
        int temp = arr[low][i];
        arr[low][i]= arr[high][i];
        arr[high][i] = temp;
    }
    static void swap(int arr[][],int i,int j){
        int temp = arr[i][j];
        arr[i][j]= arr[j][i];
        arr[j][i] = temp;
    }
    static void transpose(int arr[][]){
       for(int i=0;i<n;i++)
       for(int j=i+1;j<n;j++)
       swap(arr,i,j);
     
       for(int i=0;i<n;i++){
            int low=0,high=n-1;
       
       while(low<high){
           Swap(arr,i,low,high);
           low++;
           high--;
       }
       }
    }
	public static void main (String[] args) {
	int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	transpose(arr);
	       for(int i=0;i<n;i++){
       for(int j=0;j<n;j++)
       System.out.print(arr[i][j]+" ");
       System.out.println();}
	}
}