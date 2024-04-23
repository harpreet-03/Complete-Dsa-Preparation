import java.util.*;

public class Stack_using_JCF {
    public static void main(String[] args) {
        // Create a stack using JCF (Java Collections Framework)
        Stack<Integer> s = new Stack<Integer>();
        
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
