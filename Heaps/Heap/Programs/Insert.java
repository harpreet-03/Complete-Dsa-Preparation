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

            }
        }

        // Get Min in Heap
        public int getMin() {
            return arr.get(0);
        }
    }


    public static void main(String[] args) {

    }
}
