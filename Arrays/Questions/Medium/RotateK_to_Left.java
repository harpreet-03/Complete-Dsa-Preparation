import java.util.*;
public class RotateK_to_Left {

    public static void rotate_to_left_by_K(int arr[], int k){
        int n = arr.length;
        k %=n;

        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);

    }
    public static void reverse(int arr[], int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n =7;
        int k= 3;
        System.out.print("Original Array: ");
        for(int i : arr)System.out.print(i+" ");
        System.out.println();
        
        System.out.print("Rotated Array: ");
        rotate_to_left_by_K(arr,k);
        for(int i : arr)System.out.print(i + " ");


    }
}
