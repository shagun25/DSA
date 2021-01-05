/*package whatever //do not write package name here */
import java.util.*; 
import java.io.*;
class Stack{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    int curr_size;
    Stack(){
        curr_size=0;
    }
    void push(int x){
       curr_size++; 

			while (!q1.isEmpty())
				q2.add(q1.remove()); 
			
			q1.add(x); 

			while (!q2.isEmpty())
				q1.add(q2.remove()); 
	 
    }
    void pop(){
        if(q1.isEmpty())
        return;
        curr_size--;
        q1..remove();
    }
    int top(){
        if(q1.isEmpty())
        return -1;
        return q1.peek();
    }
    int size(){
        return curr_size;
    }
}
class GFG {
	public static void main (String[] args) {
		Stack s = new Stack(); 
		s.push(10); 
        s.push(5); 
        s.push(15); 
        s.push(20);

		System.out.println("current size: " + s.size()); 
		System.out.println(s.top()); 
		s.pop(); 
		System.out.println(s.top()); 
		s.pop(); 
		System.out.println(s.top()); 

		System.out.println("current size: " + s.size()); 
	}
}