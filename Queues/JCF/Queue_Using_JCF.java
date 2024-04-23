import java.util.*;

public class Queue_Using_JCF {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<Integer>();
        //or using ArrayDeque
        Queue<Integer> q = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(30);

        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }

    }
}
