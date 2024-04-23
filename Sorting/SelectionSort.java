public class SelectionSort {

    public static void Ssort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int t = 0;
            t = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = t;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 7, 6, 5, 3, 4, 1 };
        Ssort(arr);

        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
