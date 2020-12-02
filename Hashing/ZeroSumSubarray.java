import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main (String[] args) {
		int arr[] = new int[]{5, 3, 9, -4, -6, 7, -1};
        int n = arr.length;
        
        System.out.println(ZeroSumSubarray(arr, n));
	}
	static int ZeroSumSubarray(int arr[],int n){
	   Set<Integer> h = new HashSet<>();
	    int pre_sum=0;
	    for(int i=0;i<n;i++){
	        pre_sum+=arr[i];
	        if(h.contains(pre_sum) || pre_sum==0)
	        return 1;
	        h.add(pre_sum);
	    }
	    return 0;
	}
}