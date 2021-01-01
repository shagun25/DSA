
import java.io.*;
import java.util.*;
class GFG {
    static boolean matching(char top,char str){
        return ((top=='{' && str=='}') || (top=='[' && str==']') || (top=='(' && str==')') );
    }
    static boolean isBalanced(String str){
        Stack<Character> s = new Stack<>();
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='(')
            s.push(str.charAt(i));
            else{
                if(s.isEmpty())
                return false;
                else if(matching(s.peek(),str.charAt(i))==false)
                return false;
                else
                s.pop();
            }
        }
        return s.isEmpty();
    }
	public static void main (String[] args) {
	 String str = "{[])}";
	 if(isBalanced(str))
	 System.out.println("Balanced String");
	 else
	 System.out.println("Unbalanced String");
	}
}