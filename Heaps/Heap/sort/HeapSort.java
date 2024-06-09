// ascending order: Max-heap
// descending order: Min-heap


public class HeapSort { // O(nlogn)
    public static void main(String[] args) {
        int[] arr = {10, 15, 50, 4, 20};
        int n = arr.length;

        heapSort(arr, n);
        System.out.print("Sorted: [ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print(" ]");
    }

    public static void heapSort(int[] arr, int n) {
        // build heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // find largest element
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // swap largest element with root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}
