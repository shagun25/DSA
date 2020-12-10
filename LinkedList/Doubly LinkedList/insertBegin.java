import java.io.*;
class Node{
        int data;
        Node next,prev;
        Node(int x){
            data=x;
            next=null;
            prev=null;
        }
    }

class GFG {
    static Node insertBegin(Node head,int x){
        Node temp = new Node(x);
        if(head==null)
        return temp;
        temp.next=head;
        head.prev=temp;
        return temp;
    }
    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
        }
    }
	public static void main (String[] args) {
		Node head = null;
		head = insertBegin(head,40);
		head = insertBegin(head,30);
		head = insertBegin(head,20);
		head = insertBegin(head,10);
	    printList(head);
	}
}