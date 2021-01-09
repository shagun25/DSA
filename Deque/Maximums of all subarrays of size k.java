/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    static void printMax(int arr[],int k){
        int n = arr.length;
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
              dq.removeLast();
            dq.addLast(i);
        }
        for(int i=k;i<n;i++){
            System.out.print(arr[dq.peekFirst()+" "]);
             while(!dq.isEmpty() && dq.peekLast()<=i-k)
              dq.removeFirst();
             while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
              dq.removeLast();
            dq.addLast(i);
        }
         System.out.print(arr[dq.peekFirst()]);
    }
	public static void main (String[] args) {
	int arr[] = { 20, 40, 30, 10, 60};
        int k = 3;
    printMax(arr,k);
	}
}