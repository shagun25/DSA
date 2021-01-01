import java.io.*;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
class MyStack{
    Node head;
    int sz;
    MyStack(){
        head = null;
        sz=0;
    }
    void push(int x){
	   Node temp = new Node(x);
	   temp.next = head;
	   head = temp;
	   sz++;
	}
	int pop(){
	     if(sz==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
	     int res = head.data;
	     head = head.next;
	     sz--;
	  return res;
	}
	int peek(){
	     if(sz==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
	    return head.data;
	}
	int size(){
	    return sz;
	}
	boolean isEmpty(){
	    return head==null;
	}
}
class GFG {
	public static void main (String[] args) {
		MyStack s = new MyStack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
	}
}