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
            head.data=head.next.data;
            head.next=head.next.next;
            return head;
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