import java.util.*;

public class Stack_using_JCF {
    public static void main(String[] args) {
        // Create a stack using JCF (Java Collections Framework)
        Stack<Integer> s = new Stack<Integer>();

        s.push(1);
        s.push(2);
        s.push(3);

        int elementToSearch = 2;
        boolean found = false;

        Iterator<Integer> iterator = s.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == elementToSearch) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + elementToSearch + " found in the stack.");
        } else {
            System.out.println("Element " + elementToSearch + " not found in the stack.");
        }
    }
}