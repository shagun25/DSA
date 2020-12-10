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
    static Node delTail(Node head){
        if(head==null ||head.next==null)
        return null;
        Node curr = head;
        while(curr.next!=null)
        curr=curr.next;
        curr.prev.next=null;
        return head;
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
		Node head=new Node(10);
    	Node temp1=new Node(20);
    	Node temp2=new Node(30);
    	head.next=temp1;
    	temp1.prev=head;
    	temp1.next=temp2;
    	temp2.prev=temp1;
	    printList(head);
	    head = delTail(head);
	    printList(head);
	}
}