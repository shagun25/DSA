import java.util.*;
import java.io.*;
import java.lang.*;

class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
  
class Test { 
     
    static Node delHead(Node head){
        if(head==null || head.next==null) return null;
            Node curr=head;
            while(curr.next!=head)
                curr=curr.next;
            curr.next=head.next;
        return head.next;
    }
    public static void printlist(Node head){
        if(head==null)return;
        Node r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
        System.out.println();
    }
    public static void main(String args[]) 
    { 
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=head;
    	printlist(head);
    	head=delHead(head);
    	printlist(head);
    } 
} 