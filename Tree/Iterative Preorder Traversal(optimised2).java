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
    	
        iterativePreorder(root);
    } 
    static void iterativePreorder(Node root){
        Stack<Node> s = new Stack<>();
        Node curr=root;
        while(curr!=null || !s.isEmpty()){
            while(curr!=null){
                System.out.print(curr.key+" ");
                s.push(curr);
                curr=curr.left;
            }
            curr = s.pop();
            curr = curr.right;
        }
    }
} 