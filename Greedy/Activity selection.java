/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;
import java.lang.*;
class Activity{
    int start,finish;
    Activity(int s,int f){
        start= s;
        finish=f;
    }
}
class Mycmp implements Comparator<Activity>{
    public int compare(Activity a1,Activity a2){
        return a1.finish-a2.finish;
    }
}
class GFG {
    static int maxActivity(Activity arr[]){
        Arrays.sort(arr,new Mycmp());
        int prev=0,res=1;
        for(int curr =1;curr<arr.length;curr++){
            if(arr[curr].start>=arr[prev].finish){
                res++;
                prev=curr;
            }
        }
        return res;
    }
	public static void main (String[] args) {
		Activity arr[] = {
		    new Activity(12,25),
		    new Activity(10,20),
		    new Activity(20,30)
		};
		System.out.print(maxActivity(arr));
	}
}