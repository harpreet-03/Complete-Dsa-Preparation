import java.util.*;

public class Insert {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { // O(log n)
            // add at last
            arr.add(data);

            // Parent index
            int x = arr.size() - 1;
            int par = (x - 1) / 2;

            while (arr.get(x) < arr.get(par)) { // O(log n)
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                // Update indices
                x = par;
                par = (x - 1) / 2;

            }
        }

        // Get Min in Heap
        public int getMin() {
            return arr.get(0);
        }

        // Print the heap
        public void printHeap() {
            System.out.println(arr);
        }
    }

    public static void main(String[] args) {
        Heap minHeap = new Heap();
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(2);
        minHeap.add(7);

        // Print the heap
        minHeap.printHeap();

        // Get the minimum element in the heap
        System.out.println("The minimum element is: " + minHeap.getMin());
    }
}
