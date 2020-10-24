/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static int sqRoot(int x){
        int low=1,high=x,ans=-1;
         while(low<=high){   
            int mid = (low+high)/2;
            int sq = mid*mid;
            if(sq==x)
             return mid;
            else if(sq>x)
            high=mid-1;
            else{
             low=mid+1;
             ans=mid;
            }
        }
      return ans;
    }
 
	public static void main (String[] args) {
	System.out.print(sqRoot(10));
	}
}