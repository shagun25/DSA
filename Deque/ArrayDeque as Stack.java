// Java program to demonstrate working of
// ArrayDeque in Java
import java.util.ArrayDeque;

class GfG{
    public static void main(String args[])
    {
        // Creating empty ArrayDeque
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

        // Pushing items to the ad using add()
        ad.push(10);
        ad.push(20);
        
        // Returns the top of stack, 20
        System.out.println(ad.peek());
        
        // Returns and Removes the top of stack, 20
        System.out.println(ad.pop());
        
        // Returns the top of stack, 10
        System.out.println(ad.peek());
        
        // Pushes 40
        ad.push(40);
        
        // Returns the top of stack, 40
        System.out.println(ad.peek());
    }
}
