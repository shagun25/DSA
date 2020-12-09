/*package whatever //do not write package name here */

import java.io.*;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
class GFG {
    static Node delHead(Node head){
        if(head==null || head.next==null)
        return null;
        return head.next;
    }
    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
	public static void main (String[] args) {
	Node head = new Node(10);
	head.next = new Node(20);
	head.next.next = new Node(30);
	head.next.next.next = new Node(40);
	printList(head);
	head=delHead(head);
	printList(head);
	}
}