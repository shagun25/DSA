/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static int R=4,C=4;
    static void search(int arr[][],int x){
     int i=0,j=C-1;
     while(i<R && j>=0){
         if(arr[i][j]==x)
         {
             System.out.println("Found at ("+i+","+j+")");
             return;
         }
         else if(arr[i][j]>x)
         j--;
         else
         i++;
     }
    System.out.println("Not Found");
    }
	public static void main (String[] args) {
	int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	search(arr,10);
	}
}