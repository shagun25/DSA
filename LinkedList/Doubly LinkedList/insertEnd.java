import java.util.*;
import java.io.*;
import java.lang.*;

class Node{
        int data;
        Node prev;
        Node next;
        Node(int d){
            data=d;
            prev=null;
            next=null;
        }
    }
  
class Test { 
    
    static Node insertEnd(Node head,int data){
        Node temp=new Node(data);
        if(head==null)
        return temp;
        Node curr = head;
        while(curr.next!=null)
        curr=curr.next;
        curr.next=temp;
        temp.prev=curr;
        return head;
    }
    
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
    }
    public static void main(String args[]) 
    {   Node head = null;
        head = insertEnd(head,10);
        head = insertEnd(head,20);
        head = insertEnd(head,30);
        head = insertEnd(head,40);
    	printlist(head);
    	
    } 
} 