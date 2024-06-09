import java.util.PriorityQueue;
import java.util.Comparator;

public class NearbyCars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.distSq = x * x + y * y; // Calculate distance squared in the constructor
        }

        @Override
        public int compareTo(Point p2) {
            return Integer.compare(p2.distSq, this.distSq); // Reverse order for max-heap
        }
    }

    public static void main(String[] args) {
        int[][] pts = {
            {3, 3},
            {5, -1},
            {-2, 4},
            {1,1}
        };

        int k = 2;
        int n = pts.length;

        if (k > n) {
            System.out.println("The number of cars requested exceeds the total number of cars available.");
            return;
        }

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            Point point = new Point(pts[i][0], pts[i][1]);
            pq.add(point);
            if (pq.size() > k) {
                pq.poll(); // Remove the farthest point if the size exceeds K
            }
        }

        // Print nearest K cars
        while (!pq.isEmpty()) {
            Point p = pq.poll();
            System.out.println("Car: (" + p.x + ", " + p.y + ")");
        }
    }
}
