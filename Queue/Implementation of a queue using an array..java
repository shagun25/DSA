/*package whatever //do not write package name here */

import java.io.*;
class Queue{
    int size,cap,Front;
    int[] arr;
    Queue(int c){
       cap=c;
       size=0;Front=0;
       arr = new int[cap];
    }
    void enqueue(int x){
        if(isFull()) return;
        int Rear=(Front+size-1)%cap;
        Rear = (Rear+1)%cap;
        arr[size]=x;
        size++;
    }
    int dequeue(){
        if(isEmpty()) return -1;
        int res=Front;
        Front = (Front+1)%cap;
        size--;
        return arr[res];
    }
    int getFront(){
        if(isEmpty()) return -1;
        return arr[Front];
    }
    int getRear(){
        if(isEmpty()) return -1;
        return arr[(Front+size-1)%cap];
    }
    boolean isFull(){
        return (cap==size);
    }
    boolean isEmpty(){
         return (size==0);
    }
    
}
class GFG {
	public static void main (String[] args) {
	 	Queue q = new Queue(1000); 

		q.enqueue(10); 
		q.enqueue(20); 
		q.enqueue(30); 
		q.enqueue(40); 
		
		System.out.println(q.dequeue() 
						+ " dequeued from queue\n"); 
		System.out.println("Front item is "
						+ q.getFront()); 

		System.out.println("Rear item is "
						+ q.getRear()); 
	}
}