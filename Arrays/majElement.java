/*package whatever //do not write package name here */

import java.io.*;
class GFG {
    static int majElement(int arr[]){
    int n = arr.length;
    int count=1,res=0;
    for(int i=1;i<n;i++){
        if(arr[res]==arr[i])
        count++;
        else
        count--;
        if(count==0){
            count=1;
            res=i;
        }
    }
    for(int i=0;i<n;i++)
        if(arr[res]==arr[i])
        count++;
    if(count<=n/2)
    return -1;
    return res;
}
	public static void main (String[] args) {
	int arr[] = {8,8,6,6,6,4,6};
System.out.println(	majElement(arr));
	}
}