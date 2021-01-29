import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    static int purchaseMaxItems(int cost[],int sum){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int n = cost.length;
        
       for(int i=0;i<n;i++)
       pq.add(cost[i]);
       
        int res =0;
        for(int i=0;i<n;i++){
            if(pq.peek()<sum)
            {
                 sum-= pq.poll();
                 res++;
            }
            else break;
        }
        return res;
    }
	public static void main (String[] args) {
		int cost[] = new int[]{1,12,5,111,200};
		int sum = 10;
		System.out.print(purchaseMaxItems(cost,sum));
	}
}