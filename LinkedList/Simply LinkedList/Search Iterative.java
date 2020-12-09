import java.util.*;
import java.io.*;
import java.lang.*;

class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
  
class Test { 
    static int search(Node head,int x){
        int pos=1;
        Node curr = head;
        while(curr!=null){
            if(curr.data==x)
            return pos;
            curr=curr.next;
            pos++;
        }
        return -1;
    }
    static void printlist(Node head)
    {
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
        }
     System.out.println();
    }
    public static void main(String args[]) 
    { 
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
        printlist(head);
    	System.out.println("Position of searched item is: "+search(head,30));
    } 
} 