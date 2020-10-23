

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++)
                    matrix[i][j] = sc.nextInt();

            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.sumTriangles(matrix,n);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        int upp=0,low=0;
        for(int i=0;i<n;i++)
        for(int j=i;j<n;j++)
        upp+=matrix[i][j];
        
        for(int i=0;i<n;i++)
        for(int j=0;j<=i;j++)
        low+=matrix[i][j];
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(upp);
        arr.add(low);
        return arr;
    }
}