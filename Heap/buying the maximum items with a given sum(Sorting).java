import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    static int purchaseMaxItems(int cost[],int sum){
        Arrays.sort(cost);
        int n = cost.length;
        int res =0;
        for(int i=0;i<n;i++){
            if(cost[i]<sum)
            {
                 sum-= cost[i];
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