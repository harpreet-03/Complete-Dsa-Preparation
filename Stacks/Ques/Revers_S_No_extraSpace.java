
import java.util.Stack;

public class Revers_S_No_extraSpace {

    public static void printStack(Stack<Integer> s) {
        while(!s.empty()) {
            System.out.print(s.pop() + " ");
        }
    }


    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }


        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }


    public static void reverse(Stack<Integer>s) {
        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverse(s);
        pushAtBottom(s,top);
    }



    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

        s.push(1);
        s.push(2);
        s.push(3);
        

        reverse(s);
        System.out.print("Reversed Stack: ");
        printStack(s);
        
        
    }
}
