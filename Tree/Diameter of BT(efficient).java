/*package whatever //do not write package name here */

import java.io.*;
class Node  
{ 
  int key; 
  Node left; 
  Node right; 
  Node(int k){
      key=k;
      left=right=null;
  }
}
class GFG {
    static int res = 0;
    public static int height(Node root){
        if(root==null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        res = Math.max(res,1+rh+lh);
        return 1+Math.max(lh,rh);
    }
	public static void main (String[] args) {
	 Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(60);
	    root.right.left.left=new Node(50);
	    root.right.right.right=new Node(70);
    	System.out.println("height "+height(root));
    	System.out.print("diameter of tree "+res);
	}
	
}