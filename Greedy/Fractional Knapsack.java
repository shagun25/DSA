import java.util.*;
import java.lang.*;
import java.io.*;
class Item implements Comparable<Item>{
    int val,wt;
    Item(int w,int v){
        wt=w;
        val=v;
    }
    public int compareTo(Item i){
        return ((wt*(i.val)) - (val*(i.wt)));
    }
}
class GFG {
    static double fracKnapsack(Item arr[],int W){
        Arrays.sort(arr);
        double res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i].wt<=W){
                W-=arr[i].wt;
                res+=arr[i].val;
            }
            else{
                res+=(arr[i].val)*(double)W/(double)arr[i].wt;
            }
        }
        return res;
    }
	public static void main (String[] args) {
		Item arr[] = {
		     new Item(10,60),
		     new Item(40,40),
		     new Item(20,100),
		     new Item(30,120),
		};
		int knapCapacity=50;
		System.out.print(fracKnapsack(arr,knapCapacity));
	}
}