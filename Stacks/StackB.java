import java.util.ArrayList;

public class StackB {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<Integer>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push an element to the stack

        public static void push(int data) {
            list.add(data);
            // element will be added to the top of the stack
        }

        // Pop an element from the stack
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek an element from the stack
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            
            int top = list.get(list.size() - 1);
            return top;
        }

    }

    public static void main(String[] args) {
        System.out.println("Stack Implementation: ");
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        //printing the stack elements

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
