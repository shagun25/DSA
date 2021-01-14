import java.util.*;
import java.io.*;
import java.lang.*;

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
    
    public static void main(String args[]) 
    { 
        Node root=new Node(1);
    	root.left=new Node(2);
    	root.right=new Node(3);
    	root.left.left=new Node(4);
    	root.left.right=new Node(5);
    	root.right.left=new Node(6);
    	root.right.right=new Node(7);
    	
        printSpiral(root);
    } 
    
    public static void printSpiral(Node root){
        if(root==null) return;
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.add(root);
        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
               Node curr = s1.pop();
               System.out.print(curr.key+ " ");
               if(curr.left!=null) s2.add(curr.left);
               if(curr.right!=null) s2.add(curr.right);
            }
            while(!s2.isEmpty()){
               Node curr = s2.pop();
               System.out.print(curr.key+ " ");
               if(curr.right!=null) s1.add(curr.right);
               if(curr.left!=null) s1.add(curr.left);
            }
        }
    }   
} 