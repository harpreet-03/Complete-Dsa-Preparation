import java.util.PriorityQueue;

public class Priority_queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(44);
        pq.add(10);
        pq.add(15);
        pq.add(7);
        pq.add(20);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + "  ");
            pq.remove();
        }
        System.out.println();
    }

    /*
     * Ouptut: 7  10  15  20  44  
     */
}