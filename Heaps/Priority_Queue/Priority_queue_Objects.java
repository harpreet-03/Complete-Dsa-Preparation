import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_queue_Objects {
    // Make the Student class static
    public static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }

    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("Amar", 44));
        pq.add(new Student("Bablu", 10));
        pq.add(new Student("Dilgit", 15));
        pq.add(new Student("Harpreet", 7));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
    }
}
