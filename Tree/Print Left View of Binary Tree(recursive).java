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
    static int max_level=0;
    static void printLeft(Node root,int level){
        if(root==null) return;
        if(max_level<level)
        {
            System.out.print(root.key+" ");
            max_level++;
        }
        printLeft(root.left,level+1);
        printLeft(root.right,level+1);
    }
    static void printLeftView(Node root){
        printLeft(root,1);
    }
	public static void main (String[] args) {
        Node root=new Node(10);
    	root.left=new Node(20);
    // 	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right=new Node(30);
    // 	root.right.left=new Node(60);
    // 	root.right.right=new Node(70);
    	
        printLeftView(root);
	}
}