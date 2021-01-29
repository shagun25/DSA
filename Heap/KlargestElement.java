import java.util.*;
import java.io.*;
class GFG {
    public static void KlargestElement(int arr[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<k;i++)
          pq.add(arr[i]);
        
        int n = arr.length;
        for(int i=k+1;i<n;i++){
          if(pq.peek()<arr[i]){
            pq.poll();
            pq.add(arr[i]);
        }
        else continue;
        }
        Iterator iterator = pq.iterator();
        while(iterator.hasNext())
          System.out.print(iterator.next()+" ");
    }
	public static void main (String[] args) {
		int arr[] = new int[]{5,15,10,20,8};
		int k=2;
		KlargestElement(arr,k);
	}
}