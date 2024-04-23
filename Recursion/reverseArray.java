import java.util.Arrays;

public class reverseArray {

    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // Swap elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursively call reverse on smaller subarray
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Reverse the array
        reverse(arr, 0, arr.length - 1);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
