import java.util.Scanner;

public class SortedArray {

    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true; // Base case: the entire array has been checked and is sorted
        }
        if (arr[i] > arr[i + 1]) {
            return false; // If current element is greater than the next element, array is not sorted
        }
        return isSorted(arr, i + 1); // Recursively check the next pair of elements
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 2, 3};
        
        boolean sorted = isSorted(arr, 0); // Check if the array is sorted

        if (sorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
    }
}
