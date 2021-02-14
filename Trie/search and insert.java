/*package whatever //do not write package name here */
import java.lang.*;
import java.io.*;
class TrieNode{
    TrieNode child[] = new TrieNode[26];
    boolean isEnd;
    TrieNode(){
        for(int i=0;i<26;i++)
          child[i]=null;
        isEnd = false;
    }
}
class GFG {
    public static void insert(TrieNode root,String key){
        TrieNode curr = root;
        for(int i=0;i<key.length();i++){
            int index = key.charAt(i)-'a';
            
            if(curr.child[index]==null)
            curr.child[index] = new TrieNode();
            
            curr = curr.child[index];
        }
        curr.isEnd= true;
    }
    public static boolean search(TrieNode root,String key){
        TrieNode curr = root;
        for(int i=0;i<key.length();i++){
            int index = key.charAt(i)-'a';
            
            if(curr.child[index]==null)
            return false;
            
            curr = curr.child[index];
        }
        return curr.isEnd;
    }
	public static void main (String[] args) {
		String Key[] = {"bad", "bat", "geek", "geeks", "cat", 
						"cut"};
	    TrieNode root = new TrieNode();
	    
	    for(int i=0;i<Key.length;i++)
	    insert(root,Key[i]);
	    
	    System.out.println(search(root,"bad"));
	    System.out.println(search(root,"gee"));
	    System.out.println(search(root,"geek"));
	}
}