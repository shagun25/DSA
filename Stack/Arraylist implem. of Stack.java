import java.io.*;
import java.util.*;
class MyStack{
    ArrayList<Integer> al = new ArrayList<>();
    void push(int x){
	   al.add(x);
	}
	int pop(){
	     if(al.isEmpty()){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
	     int res = al.get(al.size()-1);
	     al.remove(al.size()-1);
	     return res;
	}
	int peek(){
	     if(al.isEmpty()){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
	    return al.get(al.size()-1);
	}
	int size(){
	    return al.size();
	}
	boolean isEmpty(){
	    return al.isEmpty();
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