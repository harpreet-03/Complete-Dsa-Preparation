import java.util.ArrayList;

/**
 * steps:
 * 
 * 1. swap 1st and last indexes.
 * 2. delete last index (arr.remove(arr.size()-1))
 * 3. fix my heap ---> heapify
 * 
 */

/**
 * Heapify : O(log n)
 * 
 * - root: i;
 * - left: 2i+1;
 * - right: 2i+2;
 * -min = Math.min(i, 2i+1, 2i+2);
 * -swap with root
 * 
 */

class Delete {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { // O(log n)
            // add at last
            arr.add(data);

            // Parent index
            int x = arr.size() - 1;
            int par = (x - 1) / 2;

            // Min-heap
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

        // peek()
        public int peek() {
            return arr.get(0);
        }

        // Heapify function :
        private void heapify(int i) { // O(logn )
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(left) < arr.get(minIdx)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(minIdx)) {
                minIdx = right;
            }
            if (minIdx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                // Recurssion
                heapify(minIdx);
            }
        }

        // Remove from Heap
        public int remove() { // O(log n)
            int data = arr.get(0);

            // step 1: swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step 2: delete last node
            arr.remove(arr.size() - 1);

            // step 3: heapify :
            heapify(0);
            return data;

        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}