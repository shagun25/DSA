import java.util.*;
import java.io.*;
import java.lang.*;

class Job
{
	int deadline;
	int profit;

	Job(int d, int p)
	{
		deadline = d;
		profit = p;
	}
}

class MyCmp implements Comparator<Job>
{
	public int compare(Job j1, Job j2)
	{
		return (j2.profit - j1.profit);
	}
}

class GFG 
{ 

    static int maxProfit(Job arr[],int t)
    {	
	    Arrays.sort(arr, new MyCmp());
	    int dmax=0;
	   for(int curr = 0; curr < arr.length; curr++)
	    {
	    dmax=Math.max(dmax,arr[curr].deadline);
	    }
        boolean visited[] = new boolean[t];
        Arrays.fill(visited, false);
	    int res = 0;

	    for(int curr = 0; curr < arr.length; curr++)
	    {
	      for(int i=Math.min(t - 1,arr[curr].deadline-1);i>=0;i--){
	          if(!visited[i]){
	              visited[i]=true;
	              res+=arr[curr].profit;
	              break;
	          }
	      }
	    }

	    return res;
    }

    public static void main(String args[]) 
    {
    	Job arr[] = {
    	              new Job(2, 100), 
    			      new Job(1, 50), 
    				  new Job(2, 10),
    	              new Job(1, 20),
    	              new Job(3,30)
    	};

        System.out.println(maxProfit(arr,4));

    } 

}