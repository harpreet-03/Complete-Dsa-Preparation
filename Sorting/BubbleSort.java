import java.util.*;

public class BubbleSort {
    public static void bubble(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        bubble(arr);

        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
