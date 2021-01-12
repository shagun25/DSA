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
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    // 	root.right.left=new Node(60);
    // 	root.right.right=new Node(70);
    	
        iterativeInorder(root);
    } 
    static void iterativeInorder(Node root){
        if(root ==null) return;
        Stack<Node> s = new Stack<>();
        Node curr=root;
        s.push(root);
        while(!s.isEmpty()){
          curr=s.pop();
          System.out.print(curr.key+" ");
          if(curr.right!=null)   s.push(curr.right);
          if(curr.left!=null)    s.push(curr.left);
        }
    }
} 