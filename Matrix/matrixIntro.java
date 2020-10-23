/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int m = 2,n=4;
// 	int arr[][]= {{1,2,3,4},{6,7,8,9}};
// int arr[][] = new int[m][n];
int arr[][] = new int[m][];
	for(int i=0;i<arr.length;i++){
	    arr[i]=new int[i+1];
	for(int j=0;j<arr[i].length;j++)
	{
	    arr[i][j]=i;
	  System.out.print(arr[i][j]+" ");
	  
	}
	  System.out.println();  
	}
	}
}