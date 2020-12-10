/*package whatever //do not write package name here */

import java.io.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class GFG {	
    static void printList(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        for(int r=head.next;r!=head.data;r=r.next)
        System.out.println(r.data+" ");
    }
    public static void main (String[] args) {
	Node head = new Node(10);
	head.next = new Node(20);
	head.next.next = new Node(30);
	head.next.next.next = head;
	printList(head);
	}
}