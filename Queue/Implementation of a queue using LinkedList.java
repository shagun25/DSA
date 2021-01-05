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
class Queue{
    Node front,rear;
    int size;
    Queue(){
        front=rear=null;
        size=0;
    }
    void enqueue(int x){
       Node temp = new Node(x);
       size++;
       if(rear==null){
           front=rear=temp;
           return;
       }
       rear.next=temp;
       rear=temp;
    }
    void dequeue(){
        if(front==null){
            return;
        }
        front=front.next;
        if(front==null)
        rear=null;
    }
}
class GFG {
	public static void main (String[] args) {
			Queue q = new Queue(); 
		q.enqueue(10); 
		q.enqueue(20); 
		q.dequeue(); 
		q.dequeue(); 
		q.enqueue(30); 
		q.enqueue(40); 
		q.enqueue(50); 
		q.dequeue(); 
		System.out.println("Queue Front : " + q.front.data); 
		System.out.println("Queue Rear : " + q.rear.data);
		 
	}
}