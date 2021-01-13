/*package whatever //do not write package name here */
import java.util.*;
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
    public static boolean isBalanced(Node root){
        if(root==null) return true;
        int lh=height(root.left);
        int rh=height(root.right);
        return (Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right));
    }
     public static int height(Node root){
        if(root==null) return 0;
        return (Math.max(height(root.left),height(root.right))+1);
    }
	public static void main (String[] args) {
	Node root=new Node(20);
    	root.left=new Node(8);
    	root.right=new Node(12);
    	root.right.left=new Node(3);
    	root.right.right=new Node(9);
    	
        System.out.print(isBalanced(root));
	}
}