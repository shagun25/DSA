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
    public static final int Empty = -1;
    public static int index=0;
    public static void serialize(Node root,ArrayList<Integer> arr){
        if(root==null){
            arr.add(Empty);
            return;
        }
        arr.add(root.key);
        serialize(root.left,arr);
        serialize(root.right,arr);
    }
     public static Node deSerialize(ArrayList<Integer> arr){
         if(index==arr.size()) return null;
         int val = arr.get(index);
         index++;
         if(val==Empty) return null;
         Node root = new Node(val);
         root.left = deSerialize(arr);
         root.right = deSerialize(arr);
         return root;
     }
      public static void inorder(Node root){
          if(root!=null){
              System.out.print(root.key+ " ");
              inorder(root.left);
              inorder(root.right);
          }
      }
	public static void main (String[] args) {
        Node root=new Node(10);
    	root.left=new Node(20);
    	ArrayList<Integer> arr = new ArrayList<>();
    	serialize(root,arr);
    	for(int i:arr)
    	System.out.print(i+" ");
    	System.out.println();
    	root = deSerialize(arr);
    	inorder(root);
	}
}