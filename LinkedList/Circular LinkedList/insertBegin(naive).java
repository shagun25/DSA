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
        Node curr = head;
        do{
        System.out.println(curr.data+" ");
        curr=curr.next;
        }while(curr!=head)
    }
    public static void main (String[] args) {
	Node head = new Node(10);
	head.next = new Node(20);
	head.next.next = new Node(30);
	head.next.next.next = head;
	printList(head);
	}
}