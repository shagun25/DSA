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
class GFG {	public static void main (String[] args) {
	Node head = new Node(10);
	head.next = new Node(20);
	head.next.next = new Node(30);
	head.next.next.next = head;
	}
}